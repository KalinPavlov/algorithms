defmodule FibonacciNumbersTest do
  use ExUnit.Case
  doctest FibonacciNumbers

  import FibonacciNumbers

  test "naive version with negative number" do
    assert_raise ArgumentError, fn -> fib_nums(-1) end
  end

  test "naive version F(0)" do
    assert fib_nums(0) == 0
  end

  test "naive version F(1)" do
    assert fib_nums(1) == 1
  end

  test "naive version F(9)" do
    assert fib_nums(9) == 34
  end

  test "tail recursion version with negative number" do
    assert_raise ArgumentError, fn -> fib_nums_tail(-1) end
  end

  test "tail recursion version F(0)" do
    assert fib_nums_tail(0) == 0
  end

  test "tail recursion version F(1)" do
    assert fib_nums_tail(1) == 1
  end

  test "tail recursion version F(9)" do
    assert fib_nums_tail(9) == 34
  end
end
