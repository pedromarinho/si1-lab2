
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
object index extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[Integer,List[Anuncio],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*2.2*/(contAnuncios: Integer)(anuncios: List[Anuncio]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._


Seq[Any](format.raw/*2.50*/("""

"""),format.raw/*5.1*/(""" 
"""),_display_(Seq[Any](/*6.2*/main("CMP Music")/*6.19*/{_display_(Seq[Any](format.raw/*6.20*/("""
  <style>
.searchButton"""),format.raw/*8.14*/("""{"""),format.raw/*8.15*/("""
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
width:57px;
padding:9px 120px;
cursor:pointer;
margin:0 auto;
"""),format.raw/*25.1*/("""}"""),format.raw/*25.2*/("""
.i2Style:active"""),format.raw/*26.16*/("""{"""),format.raw/*26.17*/("""
cursor:pointer;
position:relative;
top:2px;
"""),format.raw/*30.1*/("""}"""),format.raw/*30.2*/("""
#textdescricao """),format.raw/*31.16*/("""{"""),format.raw/*31.17*/("""
   overflow: hidden;
   text-overflow: ellipsis;
   display: -webkit-box;
   line-height: 16px;     /* fallback */
   max-height: 32px;      /* fallback */
   -webkit-line-clamp: 2; /* number of lines to show */
   -webkit-box-orient: vertical;
"""),format.raw/*39.1*/("""}"""),format.raw/*39.2*/("""
.input-search"""),format.raw/*40.14*/("""{"""),format.raw/*40.15*/("""
  width:300px;

"""),format.raw/*43.1*/("""}"""),format.raw/*43.2*/("""

    

  </style>
  <div class="container">
        <p>Músicos ajudados: """),_display_(Seq[Any](/*49.31*/contAnuncios)),format.raw/*49.43*/("""</p> 

        """),_display_(Seq[Any](/*51.10*/helper/*51.16*/.form(action=routes.Application.buscar())/*51.57*/ {_display_(Seq[Any](format.raw/*51.59*/("""
        <div class="sidebar">
                <div class="insideSidebar">
              
                  
                    
              
                  <form role="form" >
                            <div class="form-group" >
            
                    
                          

                              <h3>Encontrar anúncios</h3>
                              <p>
                              
                              <input class="input-search" name="key" type="text" placeholder="Palavra-chave, instrumento, estilo musical, endereço">
                              </p>

                             
                            </div>

                            <div style="text-align: left; margin-left: 80px;">
                                    <label for="option-one" class="pure-checkbox">
                                        <input  name="banda" id="option-one" type="checkbox" value="Tocar em banda">
                                        Toca em banda
                                    </label><br>

                                    <label  for="option-one" class="pure-checkbox">
                                        <input name="ocasional" id="option-one" type="checkbox" value="Tocar ocasionalmente">
                                        Toca ocasionalmente
                                    </label><br>

                            </div>
                                
                            
                            <br>
                            <button class="searchButton" >Buscar</button>

                   
                    
             
               
                    
                    </form>
              </div> <!--END #insideBar -->


          </div><!--END #sideBar -->
          

        
    
  """)))})),format.raw/*104.4*/("""
     
       
            
  
  """),_display_(Seq[Any](/*109.4*/if(anuncios.isEmpty)/*109.24*/{_display_(Seq[Any](format.raw/*109.25*/("""
        
      <h2>Nenhum anúncio encontrado</h2>
  """)))}/*112.5*/else/*112.10*/{_display_(Seq[Any](format.raw/*112.11*/("""

        """),_display_(Seq[Any](/*114.10*/for(anuncio <- anuncios) yield /*114.34*/{_display_(Seq[Any](format.raw/*114.35*/("""
          
          <div class="boxes">
            <div class="insideBox">
              <a style="font-size:30px; color: red;" href=""""),_display_(Seq[Any](/*118.61*/routes/*118.67*/.Application.showAnuncio(anuncio.getId))),format.raw/*118.106*/("""">"""),_display_(Seq[Any](/*118.109*/anuncio/*118.116*/.getTitulo)),format.raw/*118.126*/("""</a>
              <p><span style="font-size:12px; color: #000;">"""),_display_(Seq[Any](/*119.62*/anuncio/*119.69*/.getDate)),format.raw/*119.77*/("""</span>
              <p><span style="font-size:12px;">"""),_display_(Seq[Any](/*120.49*/anuncio/*120.56*/.getDescricao)),format.raw/*120.69*/("""</span>
              <p><span style="font-size:12px;"><b>Instrumentos: </b>"""),_display_(Seq[Any](/*121.70*/anuncio/*121.77*/.getInstrumentos)),format.raw/*121.93*/("""</span>
              <p><span style="font-size:16px;"><b>Desejo : </b>"""),_display_(Seq[Any](/*122.65*/anuncio/*122.72*/.getTipo)),format.raw/*122.80*/("""</span>


              
              
                  
              
              
              
            </div><!--insidebox-->
          </div><!--boxes-->
       """)))})),format.raw/*133.9*/("""
    
  """)))})),format.raw/*135.4*/("""
  </div><!--container-->  
     
""")))})))}
    }
    
    def render(contAnuncios:Integer,anuncios:List[Anuncio]): play.api.templates.HtmlFormat.Appendable = apply(contAnuncios)(anuncios)
    
    def f:((Integer) => (List[Anuncio]) => play.api.templates.HtmlFormat.Appendable) = (contAnuncios) => (anuncios) => apply(contAnuncios)(anuncios)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Fri Oct 30 21:31:44 BRT 2015
                    SOURCE: /home/pedro/UFCG/SI1/activator-dist-1.3.6/lab2si/app/views/index.scala.html
                    HASH: fd1538f8b0f8dde1dc3e8eb7d88707d7ec478a28
                    MATRIX: 789->2|947->50|975->69|1012->72|1037->89|1075->90|1126->114|1154->115|1628->562|1656->563|1700->579|1729->580|1801->625|1829->626|1873->642|1902->643|2175->889|2203->890|2245->904|2274->905|2318->922|2346->923|2457->998|2491->1010|2543->1026|2558->1032|2608->1073|2648->1075|4493->2888|4563->2922|4593->2942|4633->2943|4706->2998|4720->3003|4760->3004|4808->3015|4849->3039|4889->3040|5064->3178|5080->3184|5143->3223|5184->3226|5202->3233|5236->3243|5339->3309|5356->3316|5387->3324|5480->3380|5497->3387|5533->3400|5647->3477|5664->3484|5703->3500|5812->3572|5829->3579|5860->3587|6068->3763|6109->3772
                    LINES: 26->2|30->2|32->5|33->6|33->6|33->6|35->8|35->8|52->25|52->25|53->26|53->26|57->30|57->30|58->31|58->31|66->39|66->39|67->40|67->40|70->43|70->43|76->49|76->49|78->51|78->51|78->51|78->51|131->104|136->109|136->109|136->109|139->112|139->112|139->112|141->114|141->114|141->114|145->118|145->118|145->118|145->118|145->118|145->118|146->119|146->119|146->119|147->120|147->120|147->120|148->121|148->121|148->121|149->122|149->122|149->122|160->133|162->135
                    -- GENERATED --
                */
            