
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object viewOrder_Scope0 {
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

class viewOrder extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[List[Orders],String,play.twirl.api.HtmlFormat.Appendable] {

  /*
 * This template is called from the `index` template. This template
 * handles the rendering of the page header and body tags. It takes
 * two arguments, a `String` for the title of the page and an `Html`
 * object to insert into the body of the page.
 */
  def apply/*7.2*/(orders: List[Orders])(unauthmessage: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*7.47*/("""
"""),format.raw/*8.1*/("""<h1>"""),_display_(/*8.6*/unauthmessage),format.raw/*8.19*/("""</h1>

<table class="table table-striped">

                    """),_display_(/*12.22*/if(orders.isEmpty)/*12.40*/ {_display_(Seq[Any](format.raw/*12.42*/("""
                    """),format.raw/*13.21*/("""<tr>
                        <th>Not Found</th>
                    </tr>
                    """)))}/*16.23*/else/*16.28*/{_display_(Seq[Any](format.raw/*16.29*/("""
                    """),format.raw/*17.21*/("""<thead>
                    <tr>
                        <th>pizza kind</th>
                        <th>slices</th>
                        <th>ordered by</th>
                    </tr>
                    </thead>
                    
                    <tbody>
                    """),_display_(/*26.22*/for(x <- orders) yield /*26.38*/ {_display_(Seq[Any](format.raw/*26.40*/("""
                        """),format.raw/*27.25*/("""<tr>
                            <th>"""),_display_(/*28.34*/x/*28.35*/.kind),format.raw/*28.40*/("""</th>
                            <th>"""),_display_(/*29.34*/x/*29.35*/.number),format.raw/*29.42*/("""</th>
                            <th>"""),_display_(/*30.34*/x/*30.35*/.username),format.raw/*30.44*/("""</th>
                        </tr>
                    """)))}),format.raw/*32.22*/("""
                    """),format.raw/*33.21*/("""</tbody>
                    """)))}),format.raw/*34.22*/("""

"""),format.raw/*36.1*/("""</table>
    <a href=""""),_display_(/*37.15*/routes/*37.21*/.HomeController.orderIndex()),format.raw/*37.49*/("""">back</a>
    <a href=""""),_display_(/*38.15*/routes/*38.21*/.Users.logout()),format.raw/*38.36*/("""">log out</a>
  <!--<h1>"""),_display_(/*39.12*/orders/*39.18*/.size()),format.raw/*39.25*/(""" """),format.raw/*39.26*/("""items!</h1>-->
  <!--  """),_display_(/*40.10*/for(order <- orders) yield /*40.30*/ {_display_(Seq[Any](format.raw/*40.32*/("""-->
  <!--      <li>"""),_display_(/*41.18*/order/*41.23*/.kind),format.raw/*41.28*/("""</li>-->
  <!--      <li>"""),_display_(/*42.18*/order/*42.23*/.number),format.raw/*42.30*/("""</li>-->
  <!--  """)))}),format.raw/*43.10*/("""-->
  
"""))
      }
    }
  }

  def render(orders:List[Orders],unauthmessage:String): play.twirl.api.HtmlFormat.Appendable = apply(orders)(unauthmessage)

  def f:((List[Orders]) => (String) => play.twirl.api.HtmlFormat.Appendable) = (orders) => (unauthmessage) => apply(orders)(unauthmessage)

  def ref: this.type = this

}


}

/*
 * This template is called from the `index` template. This template
 * handles the rendering of the page header and body tags. It takes
 * two arguments, a `String` for the title of the page and an `Html`
 * object to insert into the body of the page.
 */
object viewOrder extends viewOrder_Scope0.viewOrder
              /*
                  -- GENERATED --
                  DATE: Tue Oct 04 12:33:10 PDT 2016
                  SOURCE: /Users/ximuyuan/play-java/app/views/viewOrder.scala.html
                  HASH: 8a08dc829038dc577d2a4dce96ca1dfa38d92838
                  MATRIX: 1020->260|1160->305|1187->306|1217->311|1250->324|1342->389|1369->407|1409->409|1458->430|1572->526|1585->531|1624->532|1673->553|1986->839|2018->855|2058->857|2111->882|2176->920|2186->921|2212->926|2278->965|2288->966|2316->973|2382->1012|2392->1013|2422->1022|2510->1079|2559->1100|2620->1130|2649->1132|2699->1155|2714->1161|2763->1189|2815->1214|2830->1220|2866->1235|2918->1260|2933->1266|2961->1273|2990->1274|3041->1298|3077->1318|3117->1320|3165->1341|3179->1346|3205->1351|3258->1377|3272->1382|3300->1389|3349->1407
                  LINES: 32->7|37->7|38->8|38->8|38->8|42->12|42->12|42->12|43->13|46->16|46->16|46->16|47->17|56->26|56->26|56->26|57->27|58->28|58->28|58->28|59->29|59->29|59->29|60->30|60->30|60->30|62->32|63->33|64->34|66->36|67->37|67->37|67->37|68->38|68->38|68->38|69->39|69->39|69->39|69->39|70->40|70->40|70->40|71->41|71->41|71->41|72->42|72->42|72->42|73->43
                  -- GENERATED --
              */
          