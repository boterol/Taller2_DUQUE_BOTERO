object Main {
  def main(args: Array[String]): Unit = {
    val list = List("ergi", "oaeifngoe", "123", "oiweoru", "hola")
    val s1 = "123"
    val s2 = "payan"
    print(exercise2(list, s1, s2))
  }
  def exercise1(list: List[String], s: String): Boolean =
    list match {
      case Nil => false
      case h::Nil => if(h.equals(s)) true else false
      case h::t => if(h.equals(s)) true else exercise1(t, s)
    }

  def exercise2(list: List[String], s1: String, s2: String): List[String] =
    list match {
      case Nil => list
      case h :: Nil => if (h.equals(s1)) s2::Nil else list
      case h :: t => if (h.equals(s1)) exercise2(s2::t, s1, s2) else exercise2(t, s1, s2)
    }
}