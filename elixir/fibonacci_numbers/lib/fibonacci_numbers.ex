defmodule FibonacciNumbers do
  @moduledoc false

  def fib_nums(n) when n < 0, do: raise ArgumentError
  def fib_nums(0), do: 0
  def fib_nums(1), do: 1
  def fib_nums(n), do: fib_nums(n - 1) + fib_nums(n - 2)

  def fib_nums_tail(n) when n < 0, do: raise ArgumentError
  def fib_nums_tail(n), do: fib_nums_tail(n, 0, 1)
  def fib_nums_tail(0, _acc1, _acc2), do: 0
  def fib_nums_tail(1, _acc1, acc2), do: acc2
  def fib_nums_tail(n, acc1, acc2), do: fib_nums_tail(n - 1, acc2, acc1 + acc2)
end
