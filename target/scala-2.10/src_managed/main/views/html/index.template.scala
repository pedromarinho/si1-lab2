
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
object index extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[List[Anuncio],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(anuncios: List[Anuncio]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._


Seq[Any](format.raw/*1.27*/("""

"""),format.raw/*4.1*/(""" 
"""),_display_(Seq[Any](/*5.2*/main("CMP Music")/*5.19*/{_display_(Seq[Any](format.raw/*5.20*/("""
  <style>
.searchButton"""),format.raw/*7.14*/("""{"""),format.raw/*7.15*/("""
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
"""),format.raw/*24.1*/("""}"""),format.raw/*24.2*/("""
.i2Style:active"""),format.raw/*25.16*/("""{"""),format.raw/*25.17*/("""
cursor:pointer;
position:relative;
top:2px;
"""),format.raw/*29.1*/("""}"""),format.raw/*29.2*/("""
#textdescricao """),format.raw/*30.16*/("""{"""),format.raw/*30.17*/("""
   overflow: hidden;
   text-overflow: ellipsis;
   display: -webkit-box;
   line-height: 16px;     /* fallback */
   max-height: 32px;      /* fallback */
   -webkit-line-clamp: 2; /* number of lines to show */
   -webkit-box-orient: vertical;
"""),format.raw/*38.1*/("""}"""),format.raw/*38.2*/("""
.input-search"""),format.raw/*39.14*/("""{"""),format.raw/*39.15*/("""
  width:300px;

"""),format.raw/*42.1*/("""}"""),format.raw/*42.2*/("""

    

  </style>
  <div class="container">
        """),_display_(Seq[Any](/*48.10*/helper/*48.16*/.form(action=routes.Application.buscar())/*48.57*/ {_display_(Seq[Any](format.raw/*48.59*/("""
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
          

        
    
  """)))})),format.raw/*101.4*/("""
     
       
            
  
  """),_display_(Seq[Any](/*106.4*/if(anuncios.isEmpty)/*106.24*/{_display_(Seq[Any](format.raw/*106.25*/("""
        
      <h2>Nenhum anúncio encontrado</h2>
  """)))}/*109.5*/else/*109.10*/{_display_(Seq[Any](format.raw/*109.11*/("""

        """),_display_(Seq[Any](/*111.10*/for(anuncio <- anuncios) yield /*111.34*/{_display_(Seq[Any](format.raw/*111.35*/("""
          
          <div class="boxes">
            <div class="insideBox">
              <a style="font-size:30px; color: red;" href=""""),_display_(Seq[Any](/*115.61*/routes/*115.67*/.Application.showAnuncio(anuncio.getId))),format.raw/*115.106*/("""">"""),_display_(Seq[Any](/*115.109*/anuncio/*115.116*/.getTitulo)),format.raw/*115.126*/("""</a>
              <p><span style="font-size:12px; color: #000;">"""),_display_(Seq[Any](/*116.62*/anuncio/*116.69*/.getDate)),format.raw/*116.77*/("""</span>
              <p><span style="font-size:12px;">"""),_display_(Seq[Any](/*117.49*/anuncio/*117.56*/.getDescricao)),format.raw/*117.69*/("""</span>
              <p><span style="font-size:12px;"><b>Instrumentos: </b>"""),_display_(Seq[Any](/*118.70*/anuncio/*118.77*/.getInstrumentos)),format.raw/*118.93*/("""</span>
              <p><span style="font-size:16px;"><b>Desejo : </b>"""),_display_(Seq[Any](/*119.65*/anuncio/*119.72*/.getTipo)),format.raw/*119.80*/("""</span>


              
              
                  
              
              
              
            </div><!--insidebox-->
          </div><!--boxes-->
       """)))})),format.raw/*130.9*/("""
    
  """)))})),format.raw/*132.4*/("""
  </div><!--container-->  
     
""")))})))}
    }
    
    def render(anuncios:List[Anuncio]): play.api.templates.HtmlFormat.Appendable = apply(anuncios)
    
    def f:((List[Anuncio]) => play.api.templates.HtmlFormat.Appendable) = (anuncios) => apply(anuncios)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Fri Jun 05 23:44:51 BRT 2015
                    SOURCE: /home/pedro/si1/play-bd-e-testes/app/views/index.scala.html
                    HASH: 4cd2f5a2dd97231048b751c7af019d93a2fd41c2
                    MATRIX: 781->1|916->26|944->45|981->48|1006->65|1044->66|1095->90|1123->91|1597->538|1625->539|1669->555|1698->556|1770->601|1798->602|1842->618|1871->619|2144->865|2172->866|2214->880|2243->881|2287->898|2315->899|2405->953|2420->959|2470->1000|2510->1002|4355->2815|4425->2849|4455->2869|4495->2870|4568->2925|4582->2930|4622->2931|4670->2942|4711->2966|4751->2967|4926->3105|4942->3111|5005->3150|5046->3153|5064->3160|5098->3170|5201->3236|5218->3243|5249->3251|5342->3307|5359->3314|5395->3327|5509->3404|5526->3411|5565->3427|5674->3499|5691->3506|5722->3514|5930->3690|5971->3699
                    LINES: 26->1|30->1|32->4|33->5|33->5|33->5|35->7|35->7|52->24|52->24|53->25|53->25|57->29|57->29|58->30|58->30|66->38|66->38|67->39|67->39|70->42|70->42|76->48|76->48|76->48|76->48|129->101|134->106|134->106|134->106|137->109|137->109|137->109|139->111|139->111|139->111|143->115|143->115|143->115|143->115|143->115|143->115|144->116|144->116|144->116|145->117|145->117|145->117|146->118|146->118|146->118|147->119|147->119|147->119|158->130|160->132
                    -- GENERATED --
                */
            