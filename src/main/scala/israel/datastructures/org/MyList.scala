package israel.datastructures.org

class MyList(var head:Any, var tail:MyList) {
  def isEmpty = (head == null && tail == null)
  def length: Int = if(isEmpty) 0 else 1 + tail.length
  override def toString() = if (isEmpty) " " else head + " " + tail
}
