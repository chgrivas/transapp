package com.transapp.validator

import com.transapp.dto.CreateTransactionRequestDto
import spock.lang.Specification

import java.time.Instant

class CreateTransactionRequestValidatorTest extends Specification {

  def createTransacionRequestValidator

  def setup() {
    createTransacionRequestValidator = new CreateTransactionRequestValidator()
  }

  def "transaction request is valid when timestamp is not older than 60 secs"() {
    given:
      def currentTimestamp = Instant.now().toEpochMilli()
    and:
      def request = new CreateTransactionRequestDto(timestamp: currentTimestamp)
    when:
      def isValid = createTransacionRequestValidator.isValid(request)
    then:
      isValid
  }

  def "transaction request is NOT valid when timestamp is older than 60 secs"() {
      given:
        def currentTimestamp = Instant.now().toEpochMilli()
      and:
        def request = new CreateTransactionRequestDto(timestamp: currentTimestamp - 70000)
      when:
        def isValid = createTransacionRequestValidator.isValid(request)
      then:
        !isValid
    }
}