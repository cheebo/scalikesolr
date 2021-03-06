package com.github.seratch.scalikesolr.request.query.highlighting

import org.scalatest._
import org.scalatest.matchers._

class IsMergeContiguousEnabledSpec extends FlatSpec with ShouldMatchers {

  behavior of "IsMergeContiguousEnabled"

  it should "be available" in {
    val mergeContiguous: Boolean = false
    val instance = new IsMergeContiguousEnabled(mergeContiguous)
    instance should not be null
    instance.getKey() should equal("hl.mergeContiguous")
  }

}
