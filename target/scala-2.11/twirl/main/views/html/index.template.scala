
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object index_Scope0 {
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

class index extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(message: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.19*/("""

"""),format.raw/*8.4*/("""

"""),format.raw/*10.1*/("""<!DOCTYPE html>    
<html lang="en">
<head>
    <meta charset="utf-8">
    <h>welcome to my pizza shop~ please log in.</h>
</head>    
<body>
<form method="post" action="login">
  <input type="text" name="username" /><br/>
  <input type="password" name="password" /><br/>

  <input type="submit" value="Login" />
</form>
    <h>"""),_display_(/*23.9*/message),format.raw/*23.16*/("""</h>
    <a href=""""),_display_(/*24.15*/routes/*24.21*/.Users.signupPage()),format.raw/*24.40*/("""">sign up</a>
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
object index extends index_Scope0.index
              /*
                  -- GENERATED --
                  DATE: Mon Oct 03 22:50:45 PDT 2016
                  SOURCE: /Users/ximuyuan/play-java/app/views/index.scala.html
                  HASH: 5be77abe1f788de82c5ab817967df90a114bfba4
                  MATRIX: 745->2|857->19|885->215|914->217|1269->546|1297->553|1343->572|1358->578|1398->597
                  LINES: 27->2|32->2|34->8|36->10|49->23|49->23|50->24|50->24|50->24
                  -- GENERATED --
              */
          