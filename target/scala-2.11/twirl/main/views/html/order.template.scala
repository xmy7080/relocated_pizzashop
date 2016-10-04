
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object order_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._

class order extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[String,String,play.twirl.api.HtmlFormat.Appendable] {

  /*
 * This template takes a single argument, a String containing a
 * message to display.
 */
  def apply/*5.2*/(message: String)(username: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*5.37*/("""


"""),format.raw/*8.1*/("""<!DOCTYPE html>    
<html lang="en">
<head>
    <meta charset="utf-8">
    <h>"""),_display_(/*12.9*/message),format.raw/*12.16*/("""</h>
</head>    
<body>
<form method="post" action="order">
  <!--order id: <input type="text" name="id" /><br/>-->
  pizza type: <select  name="kind" />
    <option value="pepperoni">pepperoni</option>
  <option value="veg">veg</option>
  <option value="meat ball">meat ball</option>
  <option value="onion">onion</option>
  </select>
  <br/>
  how many slices: <select name="number" />
    <option value="1">1</option>
  <option value="2">2</option>
  <option value="3">3</option>
  <option value="4">4</option>
  <option value="5">5</option>
  <option value="6">6</option>
  <option value="7">7</option>
  <option value="8">8</option>
  </select>
  <br/>
  <input type="hidden" name="username" value=""""),_display_(/*35.48*/username),format.raw/*35.56*/("""">
  <input type="submit" value="order" />
</form>
    <h></h>
    
    <a href=""""),_display_(/*40.15*/routes/*40.21*/.Users.logout()),format.raw/*40.36*/("""">log out</a>
    <a href=""""),_display_(/*41.15*/routes/*41.21*/.HomeController.viewOrder()),format.raw/*41.48*/("""">view orders</a>
</body>
</html>"""))
      }
    }
  }

  def render(message:String,username:String): play.twirl.api.HtmlFormat.Appendable = apply(message)(username)

  def f:((String) => (String) => play.twirl.api.HtmlFormat.Appendable) = (message) => (username) => apply(message)(username)

  def ref: this.type = this

}


}

/*
 * This template takes a single argument, a String containing a
 * message to display.
 */
object order extends order_Scope0.order
              /*
                  -- GENERATED --
                  DATE: Tue Oct 04 11:53:16 PDT 2016
                  SOURCE: /Users/ximuyuan/play-java/app/views/order.scala.html
                  HASH: ae0a722a1bfe45ad0a634cb9f64225f35e98cf58
                  MATRIX: 841->95|971->130|1000->133|1105->212|1133->219|1865->924|1894->932|2003->1014|2018->1020|2054->1035|2109->1063|2124->1069|2172->1096
                  LINES: 30->5|35->5|38->8|42->12|42->12|65->35|65->35|70->40|70->40|70->40|71->41|71->41|71->41
                  -- GENERATED --
              */
          