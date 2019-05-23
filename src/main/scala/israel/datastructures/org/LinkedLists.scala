package israel.datastructures.org

object LinkedLists {
  def main(args: Array[String]): Unit = {
    var l_list = new MyList(null,null)

    do {
    println("Insert Element")
    var newElement = scala.io.StdIn.readLine()
    l_list = new MyList(newElement, l_list)
      println(l_list + " Length: " + l_list.length)

    }while(true)
  }
}
