package com.transapp.validator;

public interface Validator<T>
{
  public boolean isValid(T object);
}
