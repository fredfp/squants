package squants.experimental.unitgroups.si.strict

import org.scalatest.{FlatSpec, Matchers}
import squants.energy.Energy
import squants.mass.Mass
import squants.space.Length
import squants.experimental.unitgroups.ImplicitDimensions.space._
import squants.experimental.unitgroups.ImplicitDimensions.energy._
import squants.experimental.unitgroups.ImplicitDimensions.mass._
import squants.experimental.unitgroups.UnitGroup
import squants.experimental.unitgroups.si.strict.implicits._

class StrictSiSpec extends FlatSpec with Matchers {

  behavior of "Strict SI UnitGroups"

  "The Strict SI UnitGroups" should "be implicitly derived for arbitrary dimensions" in {
    implicitly[UnitGroup[Length]].units should not be empty
    implicitly[UnitGroup[Mass]].units should not be empty
    implicitly[UnitGroup[Energy]].units should not be empty
  }

}
