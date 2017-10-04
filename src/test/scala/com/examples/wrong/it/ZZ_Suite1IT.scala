package com.examples.wrong.it

import org.scalatest.FeatureSpecLike

/**
  * Created by jreyes on 4/10/17.
  */
class ZZ_Suite1IT extends FeatureSpecLike {

  feature("Feature 1") {

    scenario("Wrong order -- This is supposed to be executed in first place") {

      assert(true)

    }

  }


}
