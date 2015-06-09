
package views.html

import play.templates._
import play.templates.TemplateMagic._

import play.api.templates._
import play.api.templates.PlayMagic._
import models._
import controllers._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.api.i18n._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import views.html._
/**/
object main extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[String,Html,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(title: String)(content: Html):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.32*/("""

<!DOCTYPE html>

<html>
    <head>
        <title>"""),_display_(Seq[Any](/*7.17*/title)),format.raw/*7.22*/("""</title>
        <link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*8.54*/routes/*8.60*/.Assets.at("stylesheets/main.css"))),format.raw/*8.94*/("""">
        <link rel="shortcut icon" type="image/png" href=""""),_display_(Seq[Any](/*9.59*/routes/*9.65*/.Assets.at("images/favicon.png"))),format.raw/*9.97*/("""">
        <script src=""""),_display_(Seq[Any](/*10.23*/routes/*10.29*/.Assets.at("javascripts/hello.js"))),format.raw/*10.63*/("""" type="text/javascript"></script>
        <script src=""""),_display_(Seq[Any](/*11.23*/routes/*11.29*/.Assets.at("javascripts/jquery.min.js"))),format.raw/*11.68*/(""""></script>
    </head>
    <body>
        <link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*14.54*/routes/*14.60*/.Assets.at("stylesheets/bootstrap.min.css"))),format.raw/*14.103*/("""">
          <style type="text/css">
            body"""),format.raw/*16.17*/("""{"""),format.raw/*16.18*/("""background: #fff url(""""),_display_(Seq[Any](/*16.41*/routes/*16.47*/.Assets.at("images/background.png"))),format.raw/*16.82*/("""");"""),format.raw/*16.85*/("""}"""),format.raw/*16.86*/(""" 
            .container"""),format.raw/*17.23*/("""{"""),format.raw/*17.24*/("""width:1100px; height: auto; margin: 0 auto; margin-top: 50px;"""),format.raw/*17.85*/("""}"""),format.raw/*17.86*/("""
            .header"""),format.raw/*18.20*/("""{"""),format.raw/*18.21*/(""" height: 150px; background: #d2d2d2;background: #fff url(""""),_display_(Seq[Any](/*18.80*/routes/*18.86*/.Assets.at("images/fundobox.png"))),format.raw/*18.119*/("""") repeat-x;"""),format.raw/*18.131*/("""}"""),format.raw/*18.132*/("""
            .insideHeader"""),format.raw/*19.26*/("""{"""),format.raw/*19.27*/("""margin: 0 auto; width:1100px; height: 150px;"""),format.raw/*19.71*/("""}"""),format.raw/*19.72*/("""
            .bar"""),format.raw/*20.17*/("""{"""),format.raw/*20.18*/("""height: 40px; background: #323436;"""),format.raw/*20.52*/("""}"""),format.raw/*20.53*/("""
            .boxes"""),format.raw/*21.19*/("""{"""),format.raw/*21.20*/("""width:640px; height: 200px; background: #fff url(""""),_display_(Seq[Any](/*21.71*/routes/*21.77*/.Assets.at("images/fundobox.png"))),format.raw/*21.110*/("""") repeat-x; border: 1px solid #ccc; margin-bottom: 15px; float: left; border-radius: 10px;"""),format.raw/*21.201*/("""}"""),format.raw/*21.202*/("""
            .insideBox"""),format.raw/*22.23*/("""{"""),format.raw/*22.24*/("""width:620px; height: 130px; margin: 0 auto; padding-top:10px; """),format.raw/*22.86*/("""}"""),format.raw/*22.87*/("""
            .insideSidebar"""),format.raw/*23.27*/("""{"""),format.raw/*23.28*/("""width:400px; height: 300px; padding-top:10px; text-align: center;"""),format.raw/*23.93*/("""}"""),format.raw/*23.94*/("""
            .sidebar"""),format.raw/*24.21*/("""{"""),format.raw/*24.22*/("""width:400px; float: right; height: 250px; background: #fff url(""""),_display_(Seq[Any](/*24.87*/routes/*24.93*/.Assets.at("images/fundobox.png"))),format.raw/*24.126*/("""") repeat-x; border: 1px solid #ccc; border-radius: 10px;"""),format.raw/*24.183*/("""}"""),format.raw/*24.184*/("""
            .clear"""),format.raw/*25.19*/("""{"""),format.raw/*25.20*/("""clear: both;"""),format.raw/*25.32*/("""}"""),format.raw/*25.33*/("""
            .logo"""),format.raw/*26.18*/("""{"""),format.raw/*26.19*/("""width:500px; height: 150px; margin-bottom: 15px; float: left; margin-left: 10px; margin-top: 30px;"""),format.raw/*26.117*/("""}"""),format.raw/*26.118*/("""
            .button_p"""),format.raw/*27.22*/("""{"""),format.raw/*27.23*/("""width:226px; float: right; height: auto; margin-top: 17px; margin-right: 17px; margin-top: 35px;"""),format.raw/*27.119*/("""}"""),format.raw/*27.120*/("""

            .publishButton"""),format.raw/*29.27*/("""{"""),format.raw/*29.28*/("""
            font:bold 15px Tahoma, Geneva, sans-serif;
            font-style:normal;
            color:#ffffff;
            background:#f26e40;
            border:0px solid #ffffff;
            text-shadow:0px -1px 1px #222222;
            box-shadow:2px 2px 5px #000000;
            -moz-box-shadow:2px 2px 5px #000000;
            -webkit-box-shadow:2px 2px 5px #000000;
            border-radius:10px 10px 10px 10px;
            -moz-border-radius:10px 10px 10px 10px;
            -webkit-border-radius:10px 10px 10px 10px;
            width:226px;
            padding:20px 43px;
            cursor:pointer;
            margin:0 auto;
            """),format.raw/*46.13*/("""}"""),format.raw/*46.14*/("""
            .publishButton:active"""),format.raw/*47.34*/("""{"""),format.raw/*47.35*/("""
            cursor:pointer;
            position:relative;
            top:2px;
            """),format.raw/*51.13*/("""}"""),format.raw/*51.14*/("""
            </style>
            <div class="bar"></div>

            <div class="header">
              <div class="insideHeader"> 
                <div class="logo">
                      <h1>CMP Music!</h1>
                  </div>
                      
                  <div class="button_p">
                      <a href=""""),_display_(Seq[Any](/*62.33*/routes/*62.39*/.Application.formularioNovoAnuncio)),format.raw/*62.73*/(""""><button class="publishButton">Criar Anúncio</button></a>
                  </div>
              </div>
            </div>
            
            """),_display_(Seq[Any](/*67.14*/content)),format.raw/*67.21*/("""
              
          </div><!--container-->  
          
          
        
        
    </body>
</html>
"""))}
    }
    
    def render(title:String,content:Html): play.api.templates.HtmlFormat.Appendable = apply(title)(content)
    
    def f:((String) => (Html) => play.api.templates.HtmlFormat.Appendable) = (title) => (content) => apply(title)(content)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Fri Jun 05 23:58:21 BRT 2015
                    SOURCE: /home/pedro/SILAB2/si1-lab2/app/views/main.scala.html
                    HASH: b6cb98a45f0698f748f9455cd60f6fa874a809d6
                    MATRIX: 778->1|902->31|990->84|1016->89|1113->151|1127->157|1182->191|1278->252|1292->258|1345->290|1406->315|1421->321|1477->355|1570->412|1585->418|1646->457|1770->545|1785->551|1851->594|1932->647|1961->648|2020->671|2035->677|2092->712|2123->715|2152->716|2204->740|2233->741|2322->802|2351->803|2399->823|2428->824|2523->883|2538->889|2594->922|2635->934|2665->935|2719->961|2748->962|2820->1006|2849->1007|2894->1024|2923->1025|2985->1059|3014->1060|3061->1079|3090->1080|3177->1131|3192->1137|3248->1170|3368->1261|3398->1262|3449->1285|3478->1286|3568->1348|3597->1349|3652->1376|3681->1377|3774->1442|3803->1443|3852->1464|3881->1465|3982->1530|3997->1536|4053->1569|4139->1626|4169->1627|4216->1646|4245->1647|4285->1659|4314->1660|4360->1678|4389->1679|4516->1777|4546->1778|4596->1800|4625->1801|4750->1897|4780->1898|4836->1926|4865->1927|5545->2579|5574->2580|5636->2614|5665->2615|5786->2708|5815->2709|6183->3041|6198->3047|6254->3081|6440->3231|6469->3238
                    LINES: 26->1|29->1|35->7|35->7|36->8|36->8|36->8|37->9|37->9|37->9|38->10|38->10|38->10|39->11|39->11|39->11|42->14|42->14|42->14|44->16|44->16|44->16|44->16|44->16|44->16|44->16|45->17|45->17|45->17|45->17|46->18|46->18|46->18|46->18|46->18|46->18|46->18|47->19|47->19|47->19|47->19|48->20|48->20|48->20|48->20|49->21|49->21|49->21|49->21|49->21|49->21|49->21|50->22|50->22|50->22|50->22|51->23|51->23|51->23|51->23|52->24|52->24|52->24|52->24|52->24|52->24|52->24|53->25|53->25|53->25|53->25|54->26|54->26|54->26|54->26|55->27|55->27|55->27|55->27|57->29|57->29|74->46|74->46|75->47|75->47|79->51|79->51|90->62|90->62|90->62|95->67|95->67
                    -- GENERATED --
                */
            