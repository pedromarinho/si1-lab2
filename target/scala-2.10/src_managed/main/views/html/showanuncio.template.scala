
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
object showanuncio extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[String,Anuncio,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(message: String)(anuncio: Anuncio):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.37*/("""
"""),_display_(Seq[Any](/*2.2*/main("Lista de Anuncios")/*2.27*/{_display_(Seq[Any](format.raw/*2.28*/("""

  """),_display_(Seq[Any](/*4.4*/if(!message.isEmpty())/*4.26*/ {_display_(Seq[Any](format.raw/*4.28*/("""
                    <script>

                    
                    alert(""""),_display_(Seq[Any](/*8.29*/message)),format.raw/*8.36*/("""");


                    </script>
  """)))})),format.raw/*12.4*/("""
  <script src="https://maps.googleapis.com/maps/api/js?v=3.exp"></script>
  
      <script type="text/javascript">

      var geocoder = new google.maps.Geocoder();
      var address = """"),_display_(Seq[Any](/*18.23*/anuncio/*18.30*/.getEndereco)),format.raw/*18.42*/("""";

      geocoder.geocode( """),format.raw/*20.25*/("""{"""),format.raw/*20.26*/(""" 'address': address"""),format.raw/*20.45*/("""}"""),format.raw/*20.46*/(""", function(results, status) """),format.raw/*20.74*/("""{"""),format.raw/*20.75*/("""

        if (status == google.maps.GeocoderStatus.OK) """),format.raw/*22.54*/("""{"""),format.raw/*22.55*/("""
          var latitude = results[0].geometry.location.lat();
          var longitude = results[0].geometry.location.lng();

          //initialize(latitude.substring(1, 4), longitude.substring(1, 4));

          var resLat = "" + latitude;
          var resLon = "" + longitude;
          if(resLat.substring(1, 2) === ".")"""),format.raw/*30.45*/("""{"""),format.raw/*30.46*/("""
            resLat = resLat.substring(0, 12);
          """),format.raw/*32.11*/("""}"""),format.raw/*32.12*/("""
          if(resLat.substring(2, 3) === ".")"""),format.raw/*33.45*/("""{"""),format.raw/*33.46*/("""
            resLat = resLat.substring(0, 13);
          """),format.raw/*35.11*/("""}"""),format.raw/*35.12*/("""
          if(resLon.substring(3, 4) === ".")"""),format.raw/*36.45*/("""{"""),format.raw/*36.46*/("""
            resLon = resLon.substring(0, 14);
          """),format.raw/*38.11*/("""}"""),format.raw/*38.12*/("""
          //alert(resLat +","+ resLon);
          //initialize(resLat, resLon);
          var map;
          var mapOptions = """),format.raw/*42.28*/("""{"""),format.raw/*42.29*/("""
              zoom: 15,
              center: new google.maps.LatLng(resLat, resLon)
            """),format.raw/*45.13*/("""}"""),format.raw/*45.14*/(""";
            map = new google.maps.Map(document.getElementById('googleMap'),
                mapOptions);
          

          google.maps.event.addDomListener(window, 'load', initialize);
        """),format.raw/*51.9*/("""}"""),format.raw/*51.10*/(""" 
      """),format.raw/*52.7*/("""}"""),format.raw/*52.8*/("""); 
  </script>
  
    

   
  <div class="container">
      <div class="sidebar" style="width:400px;height:400px;">
        <div id="googleMap" style="width:400px;height:400px;margin: 0 auto;border-radius:10px;"></div>
      </div>

      <div class="boxes" style="height:400px;">
        <div class="insideBox">
          <span style="font-size:20px; color: red;">"""),_display_(Seq[Any](/*65.54*/anuncio/*65.61*/.getTitulo)),format.raw/*65.71*/("""</span>
          <p><span style="font-size:12px; color: #000;">"""),_display_(Seq[Any](/*66.58*/anuncio/*66.65*/.getDate)),format.raw/*66.73*/("""</span>
          <p><span style="font-size:12px;">"""),_display_(Seq[Any](/*67.45*/anuncio/*67.52*/.getDescricao)),format.raw/*67.65*/("""</span>
           <p><span style="font-size:12px;"><b>Instrumentos: </b>"""),_display_(Seq[Any](/*68.67*/anuncio/*68.74*/.getInstrumentos)),format.raw/*68.90*/("""</span>
            <p><span style="font-size:12px;"><b>Estilos musicais que gosta: </b>"""),_display_(Seq[Any](/*69.82*/anuncio/*69.89*/.getEstilosQueGosta)),format.raw/*69.108*/("""</span>
             <p><span style="font-size:12px;"><b>Estilos musicais que não gosta: </b>"""),_display_(Seq[Any](/*70.87*/anuncio/*70.94*/.getEstilosQueNaoGosta)),format.raw/*70.116*/("""</span>
             <p><span style="font-size:12px;"><b>Endereco: </b>"""),_display_(Seq[Any](/*71.65*/anuncio/*71.72*/.getEndereco)),format.raw/*71.84*/("""</span>
             <p><span style="font-size:12px;"><b>Contato: </b>"""),_display_(Seq[Any](/*72.64*/anuncio/*72.71*/.getEmail)),format.raw/*72.80*/("""</span>
             <p><span style="font-size:12px;">"""),_display_(Seq[Any](/*73.48*/anuncio/*73.55*/.getFacebook)),format.raw/*73.67*/("""</span>
          
            
        </div><!--insidebox-->
      </div><!--boxes-->
  </div><!--container-->  
""")))})))}
    }
    
    def render(message:String,anuncio:Anuncio): play.api.templates.HtmlFormat.Appendable = apply(message)(anuncio)
    
    def f:((String) => (Anuncio) => play.api.templates.HtmlFormat.Appendable) = (message) => (anuncio) => apply(message)(anuncio)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Fri Jun 05 23:08:23 BRT 2015
                    SOURCE: /home/pedro/si1/play-bd-e-testes/app/views/showanuncio.scala.html
                    HASH: c23ef05e8e174b9a98f5e17c62929a6faa55e56d
                    MATRIX: 788->1|917->36|953->38|986->63|1024->64|1063->69|1093->91|1132->93|1247->173|1275->180|1345->219|1569->407|1585->414|1619->426|1675->454|1704->455|1751->474|1780->475|1836->503|1865->504|1948->559|1977->560|2329->884|2358->885|2443->942|2472->943|2545->988|2574->989|2659->1046|2688->1047|2761->1092|2790->1093|2875->1150|2904->1151|3059->1278|3088->1279|3214->1377|3243->1378|3469->1577|3498->1578|3533->1586|3561->1587|3964->1954|3980->1961|4012->1971|4113->2036|4129->2043|4159->2051|4247->2103|4263->2110|4298->2123|4408->2197|4424->2204|4462->2220|4587->2309|4603->2316|4645->2335|4775->2429|4791->2436|4836->2458|4944->2530|4960->2537|4994->2549|5101->2620|5117->2627|5148->2636|5239->2691|5255->2698|5289->2710
                    LINES: 26->1|29->1|30->2|30->2|30->2|32->4|32->4|32->4|36->8|36->8|40->12|46->18|46->18|46->18|48->20|48->20|48->20|48->20|48->20|48->20|50->22|50->22|58->30|58->30|60->32|60->32|61->33|61->33|63->35|63->35|64->36|64->36|66->38|66->38|70->42|70->42|73->45|73->45|79->51|79->51|80->52|80->52|93->65|93->65|93->65|94->66|94->66|94->66|95->67|95->67|95->67|96->68|96->68|96->68|97->69|97->69|97->69|98->70|98->70|98->70|99->71|99->71|99->71|100->72|100->72|100->72|101->73|101->73|101->73
                    -- GENERATED --
                */
            