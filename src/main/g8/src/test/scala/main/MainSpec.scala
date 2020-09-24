package app

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class MainSpec extends AnyFlatSpec with Matchers {
  "The Main object" should "check version" in {
    Main.version shouldEqual BuildInfo.version
  }
}
