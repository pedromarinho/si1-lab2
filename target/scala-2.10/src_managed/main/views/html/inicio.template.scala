
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
object inicio extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply():play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](_display_(Seq[Any](/*1.2*/main("Top 100 filmes Cult")/*1.29*/ {_display_(Seq[Any](format.raw/*1.31*/("""
<style>
body """),format.raw/*3.6*/("""{"""),format.raw/*3.7*/("""
padding-top: 50px;
"""),format.raw/*5.1*/("""}"""),format.raw/*5.2*/("""
.starter-template """),format.raw/*6.19*/("""{"""),format.raw/*6.20*/("""
padding: 40px 15px;
text-align: center;
"""),format.raw/*9.1*/("""}"""),format.raw/*9.2*/("""
</style>
<div class="navbar navbar-inverse navbar-fixed-top">
<div class="container">
<div class="navbar-header">
<button type="button" class="navbar-toggle"
data-toggle="collapse" data-target=".navbar-collapse">
</button>
<a class="navbar-brand" href="/">Top 100 filmes Cult</a>
/div>
<div class="collapse navbar-collapse">
<ul class="nav navbar-nav">
<li><a href="/sobre">Sobre o sistema</a></li>
<li><a href="/play">Sobre o Play Framework</a></li>
<li>
<a href="http://getbootstrap.com/">Sobre o Bootstrap</a>
</li>
</ul>
</div>
</div>
</div>
<div class="container">
<div class="starter-template">
<h1>Top 100 filmes Cult</h1>
<p class="lead">O melhor do cinema est&aacute; aqui !</p>
</div>
</div>
""")))})))}
    }
    
    def render(): play.api.templates.HtmlFormat.Appendable = apply()
    
    def f:(() => play.api.templates.HtmlFormat.Appendable) = () => apply()
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Oct 27 22:36:19 BRT 2015
                    SOURCE: /home/pedro/UFCG/SI1/activator-dist-1.3.6/lab2si/app/views/inicio.scala.html
                    HASH: c7119de4b7bc6f99d15d71a6e8cc4675ea56e0cc
                    MATRIX: 865->1|900->28|939->30|979->44|1006->45|1052->65|1079->66|1125->85|1153->86|1220->127|1247->128
                    LINES: 29->1|29->1|29->1|31->3|31->3|33->5|33->5|34->6|34->6|37->9|37->9
                    -- GENERATED --
                */
            