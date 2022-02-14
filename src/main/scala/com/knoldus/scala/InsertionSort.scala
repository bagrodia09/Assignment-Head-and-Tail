package com.knoldus.scala

class InsertionSort {
  def conditionToSort(list: List[Int]): List[Int] = {
    if (list.isEmpty) throw new Exception("The List is Empty!!")
    else insertionSort(list)
  }
  private def insertionSort(list: List[Int]): List[Int] = {
    if (list.isEmpty) Nil
    else insert(list.head, insertionSort(list.tail))
  }
  private def insert(listHead: Int, listTail: List[Int]): List[Int] = {
    if (listTail.isEmpty || listHead <= listTail.head) listHead :: listTail
    else listTail.head :: insert(listHead, listTail.tail)
  }
}
