import pytest

def test_addition1():
    num1=10
    num2=15
    sum=num1+num2
    assert  sum ==25

def test_substraction():
    num1=15
    num2=10
    sub=num1-num2
    assert  sub==5

def test_multiplication():
    num1=10
    num2=15
    mul=num1*num2
    assert  mul ==11

def test_quotient():
    num1=30
    num2=15
    div=num1%num2
    assert  div ==25