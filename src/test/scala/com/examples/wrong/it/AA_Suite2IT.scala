package com.examples.wrong.it

import org.scalatest.FeatureSpecLike

/**
  * Created by jreyes on 4/10/17.
  */
class AA_Suite2IT extends FeatureSpecLike {

  feature("Feature 2") {

    scenario("Wrong order -- This is supposed to be executed in second place") {

      assert(true)

    }

  }


}
