defmodule HanoiTower do
  @moduledoc """
  Documentation for `HanoiTower`.
  """

  @doc """
  Hanoi tower. The idea is to move the disks from rod A to rod C.
  The rule is that bigger disk cannot be put over smaller disk.
      |               |               |
     ---              |               |
    -----             |               |
   -------            |               |
  ____|_____      ____|_____      ____|_____
      A               B               C

                   (A -> C)
      |               |               |
      |               |               |
    -----             |               |
   -------            |              ---
  ____|_____      ____|_____      ____|_____
      A               B               C

                   (A -> B)
      |               |               |
      |               |               |
      |               |               |
   -------          -----            ---
  ____|_____      ____|_____      ____|_____
      A               B               C

                   (C -> B)
      |               |               |
      |               |               |
      |              ---              |
   -------          -----             |
  ____|_____      ____|_____      ____|_____
      A               B               C

                   (A -> C)
      |               |               |
      |               |               |
      |              ---              |
      |             -----          -------
  ____|_____      ____|_____      ____|_____
      A               B               C

                   (B -> A)
      |               |               |
      |               |               |
      |               |               |
     ---            -----          -------
  ____|_____      ____|_____      ____|_____
      A               B               C

                   (B -> C)
      |               |               |
      |               |               |
      |               |             -----
     ---              |            -------
  ____|_____      ____|_____      ____|_____
      A               B               C

                   (A -> C)
      |               |               |
      |               |              ---
      |               |             -----
      |               |            -------
  ____|_____      ____|_____      ____|_____
      A               B               C
  """
  def hanoi(1, from, _aux, to), do: move(from, to)
  def hanoi(disks, from, aux, to) do
    hanoi(disks - 1, from, to, aux)
    move(from, to)
    hanoi(disks - 1, aux, from, to)
  end

  def move(f, t), do: IO.puts("Move disk from #{f} to #{t}")
end
