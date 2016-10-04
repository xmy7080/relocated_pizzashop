
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object signup_Scope0 {
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

class signup extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(message: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.19*/("""

"""),format.raw/*7.4*/("""

"""),format.raw/*9.1*/("""<!DOCTYPE html>    
<html lang="en">
<head>
    <meta charset="utf-8">
    <h>create new user.</h>
</head>    
<body>
<form method="post" action="signup">
  <input type="text" name="username" /><br/>
  <input type="password" name="password" /><br/>

  <input type="submit" value="sign up" />
</form>
    <h>"""),_display_(/*22.9*/message),format.raw/*22.16*/("""</h>
    <a href=""""),_display_(/*23.15*/routes/*23.21*/.HomeController.index()),format.raw/*23.44*/("""">back to login</a>
</body>
</html>"""))
      }
    }
  }

  def render(message:String): play.twirl.api.HtmlFormat.Appendable = apply(message)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (message) => apply(message)

  def ref: this.type = this

}


}

/**/
object signup extends signup_Scope0.signup
              /*
                  -- GENERATED --
                  DATE: Mon Oct 03 22:48:06 PDT 2016
                  SOURCE: /Users/ximuyuan/play-java/app/views/signup.scala.html
                  HASH: 096016a20295ac7bf4868834a73c26748e849741
                  MATRIX: 747->1|859->18|887->214|915->216|1249->524|1277->531|1323->550|1338->556|1382->579
                  LINES: 27->1|32->1|34->7|36->9|49->22|49->22|50->23|50->23|50->23
                  -- GENERATED --
              */
          