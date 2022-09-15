class HelloWorldSuite extends munit.FunSuite {
  test("""test "Hello world!" message""") {
    val obtained = msg
    val expected = "Hello world!"
    assertEquals(obtained, expected)
  }
}
