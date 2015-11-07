
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

"""),_display_(Seq[Any](/*4.2*/if(!message.isEmpty())/*4.24*/ {_display_(Seq[Any](format.raw/*4.26*/("""
<script>


	alert(""""),_display_(Seq[Any](/*8.10*/message)),format.raw/*8.17*/("""");


</script>
""")))})),format.raw/*12.2*/("""
<!-- Angular JS -->
<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.4.3/angular.min.js"></script>

<script src="https://maps.googleapis.com/maps/api/js?v=3.exp"></script>

<script type="text/javascript">

	var geocoder = new google.maps.Geocoder();
	var address = """"),_display_(Seq[Any](/*21.18*/anuncio/*21.25*/.getEndereco)),format.raw/*21.37*/("""";

	geocoder.geocode( """),format.raw/*23.20*/("""{"""),format.raw/*23.21*/(""" 'address': address"""),format.raw/*23.40*/("""}"""),format.raw/*23.41*/(""", function(results, status) """),format.raw/*23.69*/("""{"""),format.raw/*23.70*/("""

		if (status == google.maps.GeocoderStatus.OK) """),format.raw/*25.48*/("""{"""),format.raw/*25.49*/("""
			var latitude = results[0].geometry.location.lat();
			var longitude = results[0].geometry.location.lng();

          //initialize(latitude.substring(1, 4), longitude.substring(1, 4));

          var resLat = "" + latitude;
          var resLon = "" + longitude;
          if(resLat.substring(1, 2) === ".")"""),format.raw/*33.45*/("""{"""),format.raw/*33.46*/("""
          	resLat = resLat.substring(0, 12);
          """),format.raw/*35.11*/("""}"""),format.raw/*35.12*/("""
          if(resLat.substring(2, 3) === ".")"""),format.raw/*36.45*/("""{"""),format.raw/*36.46*/("""
          	resLat = resLat.substring(0, 13);
          """),format.raw/*38.11*/("""}"""),format.raw/*38.12*/("""
          if(resLon.substring(3, 4) === ".")"""),format.raw/*39.45*/("""{"""),format.raw/*39.46*/("""
          	resLon = resLon.substring(0, 14);
          """),format.raw/*41.11*/("""}"""),format.raw/*41.12*/("""
          //alert(resLat +","+ resLon);
          //initialize(resLat, resLon);
          var map;
          var mapOptions = """),format.raw/*45.28*/("""{"""),format.raw/*45.29*/("""
          	zoom: 15,
          	center: new google.maps.LatLng(resLat, resLon)
          """),format.raw/*48.11*/("""}"""),format.raw/*48.12*/(""";
          map = new google.maps.Map(document.getElementById('googleMap'),
          	mapOptions);
          

          google.maps.event.addDomListener(window, 'load', initialize);
      """),format.raw/*54.7*/("""}"""),format.raw/*54.8*/(""" 
  """),format.raw/*55.3*/("""}"""),format.raw/*55.4*/("""); 
</script>




<div class="container" ng-app="lab2app">
	<div class="sidebar" style="width:400px;">
		<div id="googleMap" style="width:400px;height:400px;margin: 0 auto;border-radius:10px;"></div>
	</div>

	<div class="boxes" >
		<div class="insideBox"  style="height:400;">
			<p style="font-size:20px; color: red;">"""),_display_(Seq[Any](/*68.44*/anuncio/*68.51*/.getTitulo)),format.raw/*68.61*/("""</p>
			<p style="font-size:12px; color: #000;">"""),_display_(Seq[Any](/*69.45*/anuncio/*69.52*/.getDate)),format.raw/*69.60*/("""</p>
			<p style="font-size:12px;">"""),_display_(Seq[Any](/*70.32*/anuncio/*70.39*/.getDescricao)),format.raw/*70.52*/("""</p>
			<p style="font-size:12px;"><b>Instrumentos: </b>"""),_display_(Seq[Any](/*71.53*/anuncio/*71.60*/.getInstrumentos)),format.raw/*71.76*/("""</p>
			<p style="font-size:12px;"><b>Estilos musicais que gosta: </b>"""),_display_(Seq[Any](/*72.67*/anuncio/*72.74*/.getEstilosQueGosta)),format.raw/*72.93*/("""</p>
			<p style="font-size:12px;"><b>Estilos musicais que não gosta: </b>"""),_display_(Seq[Any](/*73.71*/anuncio/*73.78*/.getEstilosQueNaoGosta)),format.raw/*73.100*/("""</p>
			<p style="font-size:12px;"><b>Endereco: </b>"""),_display_(Seq[Any](/*74.49*/anuncio/*74.56*/.getEndereco)),format.raw/*74.68*/("""</p>
			<p style="font-size:12px;"><b>Contato: </b>"""),_display_(Seq[Any](/*75.48*/anuncio/*75.55*/.getEmail)),format.raw/*75.64*/("""</p>
			<p style="font-size:12px;">"""),_display_(Seq[Any](/*76.32*/anuncio/*76.39*/.getFacebook)),format.raw/*76.51*/("""</p>
			"""),_display_(Seq[Any](/*77.5*/helper/*77.11*/.form(action=routes.Application.adicionarPergunta(anuncio.getId))/*77.76*/ {_display_(Seq[Any](format.raw/*77.78*/("""
			<textarea ng-model="pergunta" id="pergunta" class="u-full-width" type="text" placeholder="Escreva sua pergunta..." name="pergunta" value=""></textarea>

			<button class="btQuestion" type="submit" ng-disabled="!pergunta">perguntar</button>
			""")))})),format.raw/*81.5*/("""
			"""),_display_(Seq[Any](/*82.5*/for(duvida <- anuncio.getDuvidas) yield /*82.38*/ {_display_(Seq[Any](format.raw/*82.40*/("""

			<img src=""""),_display_(Seq[Any](/*84.15*/routes/*84.21*/.Assets.at("images/pg.png"))),format.raw/*84.48*/("""" height="20" width="20"> """),_display_(Seq[Any](/*84.75*/duvida/*84.81*/.getPergunta)),format.raw/*84.93*/("""<br>
				"""),_display_(Seq[Any](/*85.6*/if(duvida.getResposta)/*85.28*/{_display_(Seq[Any](format.raw/*85.29*/("""
			&nbsp;&nbsp<img src=""""),_display_(Seq[Any](/*86.26*/routes/*86.32*/.Assets.at("images/rp.png"))),format.raw/*86.59*/("""" height="20" width="20">"""),_display_(Seq[Any](/*86.85*/duvida/*86.91*/.getResposta)),format.raw/*86.103*/("""<br><br>
				""")))}/*87.6*/else/*87.10*/{_display_(Seq[Any](format.raw/*87.11*/("""
					"""),_display_(Seq[Any](/*88.7*/helper/*88.13*/.form(action=routes.Application.adicionarResposta(anuncio.getId, duvida.getId))/*88.92*/ {_display_(Seq[Any](format.raw/*88.94*/("""
					<div id=""""),_display_(Seq[Any](/*89.16*/duvida/*89.22*/.getId)),format.raw/*89.28*/("""">
						<textarea ng-model="resposta" id="resposta" class="u-full-width" type="text" placeholder="Escreva sua resposta..." name=""""),_display_(Seq[Any](/*90.129*/duvida/*90.135*/.getId)),format.raw/*90.141*/("""" value=""></textarea>
						<input ng-model="codFinalizacao" class="u-full-width" type="text" placeholder="digite o código de finalização" name="codFinalizacao" value="">
						<button class="btQuestion" type="submit" ng-disabled="!resposta && !codFinalizacao">responder</button>
					</div>
					
					
					""")))})),format.raw/*96.7*/("""
					<button id="btResp" class="btQuestion" onclick="showDivResp()">responder</button>
				""")))})),format.raw/*98.6*/("""
			
			""")))})),format.raw/*100.5*/("""

			<div class="row">

				<div  id="idDelete" "four columns">


					<button style="width: 95%; margin:0 auto;" class="btn btn-lg btn-primary btn-block" onclick="showFormHelp()" >Finalizar anúncio</button>


				</div>
		"""),_display_(Seq[Any](/*111.4*/helper/*111.10*/.form(action=routes.Application.deletarAnuncio(anuncio.getId))/*111.72*/ {_display_(Seq[Any](format.raw/*111.74*/("""
				<div id="help">
					<input id="codigo" class="u-full-width" type="text" placeholder="código de finalização" name="idDelete" value="">
					<p>Este anúncio lhe ajudou?</p>
					<label class="radio-inline"><input type="radio" name="help" value="sim" checked="true">Sim</label>
					<label class="radio-inline"><input type="radio" name="help" value="nao">Não</label>
					<button style="width: 40%; margin:0 auto;" class="btn btn-lg btn-primary btn-block" type="submit" >Finalizar</button>

					
				</div>
			</div>

			<script>
				$( "#help" ).hide();
				$( "#divResposta" ).hide();
				console.log("era pra ter desabilitado");

				showFormHelp = function()"""),format.raw/*128.30*/("""{"""),format.raw/*128.31*/("""
					$( "#help" ).show();
					$( "#idDelete" ).hide();
				"""),format.raw/*131.5*/("""}"""),format.raw/*131.6*/("""
				showDivResp = function()"""),format.raw/*132.29*/("""{"""),format.raw/*132.30*/("""
					$( "#divResposta" ).show();
					$( "#btResp" ).hide();
				"""),format.raw/*135.5*/("""}"""),format.raw/*135.6*/("""
			</script>

			<script>
				var app = angular.module("lab2app", []);

				app.controller("lab2appController", function($scope) """),format.raw/*141.58*/("""{"""),format.raw/*141.59*/("""
				    $scope.app = "Lista de anuncios";

				    $scope.anuncios = [];
				    
				   
				    $scope.showForm = false;

				    $scope.showAnuncio = false;

				    $scope.showSearch = false;

				"""),format.raw/*153.5*/("""}"""),format.raw/*153.6*/("""

			</script>

			<style>
				#help"""),format.raw/*158.10*/("""{"""),format.raw/*158.11*/("""
					text-align: center;
					margin-top: 12px;
				"""),format.raw/*161.5*/("""}"""),format.raw/*161.6*/("""
				.btQuestion"""),format.raw/*162.16*/("""{"""),format.raw/*162.17*/("""
					font:bold 8px Tahoma, Geneva, sans-serif;
					font-style:normal;
					color:#ffffff;
					background:#1568db;
					border:0px solid #ffffff;
					text-shadow:0px -1px 1px #222222;
					box-shadow:2px 2px 5px #000000;
					-moz-box-shadow:2px 2px 5px #000000;
					-webkit-box-shadow:2px 2px 5px #000000;
					border-radius:10px 10px 10px 10px;
					-moz-border-radius:10px 10px 10px 10px;
					-webkit-border-radius:10px 10px 10px 10px;
					width:70px;
					padding:6px 8px;
					cursor:pointer;
					margin:0 auto;
					"""),format.raw/*179.6*/("""}"""),format.raw/*179.7*/("""
					.i2Style:active"""),format.raw/*180.21*/("""{"""),format.raw/*180.22*/("""
					cursor:pointer;
					position:relative;
					top:2px;
				"""),format.raw/*184.5*/("""}"""),format.raw/*184.6*/("""
				#pergunta"""),format.raw/*185.14*/("""{"""),format.raw/*185.15*/("""
					width: 80%;
				"""),format.raw/*187.5*/("""}"""),format.raw/*187.6*/("""
				#resposta"""),format.raw/*188.14*/("""{"""),format.raw/*188.15*/("""
					width: 80%;
				"""),format.raw/*190.5*/("""}"""),format.raw/*190.6*/("""
				


			</style>


		""")))})),format.raw/*197.4*/("""



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
                    DATE: Mon Nov 02 20:00:40 BRT 2015
                    SOURCE: /home/pedro/UFCG/SI1/activator-dist-1.3.6/lab2si/app/views/showanuncio.scala.html
                    HASH: 24a10d756e0ad178f37120da0a82a31ffbb3c9e0
                    MATRIX: 788->1|917->36|953->38|986->63|1024->64|1061->67|1091->89|1130->91|1186->112|1214->119|1262->136|1580->418|1596->425|1630->437|1681->460|1710->461|1757->480|1786->481|1842->509|1871->510|1948->559|1977->560|2315->870|2344->871|2428->927|2457->928|2530->973|2559->974|2643->1030|2672->1031|2745->1076|2774->1077|2858->1133|2887->1134|3042->1261|3071->1262|3189->1352|3218->1353|3435->1543|3463->1544|3494->1548|3522->1549|3879->1870|3895->1877|3927->1887|4012->1936|4028->1943|4058->1951|4130->1987|4146->1994|4181->2007|4274->2064|4290->2071|4328->2087|4435->2158|4451->2165|4492->2184|4603->2259|4619->2266|4664->2288|4753->2341|4769->2348|4803->2360|4891->2412|4907->2419|4938->2428|5010->2464|5026->2471|5060->2483|5104->2492|5119->2498|5193->2563|5233->2565|5512->2813|5552->2818|5601->2851|5641->2853|5693->2869|5708->2875|5757->2902|5820->2929|5835->2935|5869->2947|5914->2957|5945->2979|5984->2980|6046->3006|6061->3012|6110->3039|6172->3065|6187->3071|6222->3083|6254->3097|6267->3101|6306->3102|6348->3109|6363->3115|6451->3194|6491->3196|6543->3212|6558->3218|6586->3224|6754->3355|6770->3361|6799->3367|7141->3678|7265->3771|7306->3780|7566->4004|7582->4010|7654->4072|7695->4074|8390->4740|8420->4741|8509->4802|8538->4803|8596->4832|8626->4833|8720->4899|8749->4900|8908->5030|8938->5031|9168->5233|9197->5234|9262->5270|9292->5271|9373->5324|9402->5325|9447->5341|9477->5342|10034->5871|10063->5872|10113->5893|10143->5894|10235->5958|10264->5959|10307->5973|10337->5974|10387->5996|10416->5997|10459->6011|10489->6012|10539->6034|10568->6035|10625->6060
                    LINES: 26->1|29->1|30->2|30->2|30->2|32->4|32->4|32->4|36->8|36->8|40->12|49->21|49->21|49->21|51->23|51->23|51->23|51->23|51->23|51->23|53->25|53->25|61->33|61->33|63->35|63->35|64->36|64->36|66->38|66->38|67->39|67->39|69->41|69->41|73->45|73->45|76->48|76->48|82->54|82->54|83->55|83->55|96->68|96->68|96->68|97->69|97->69|97->69|98->70|98->70|98->70|99->71|99->71|99->71|100->72|100->72|100->72|101->73|101->73|101->73|102->74|102->74|102->74|103->75|103->75|103->75|104->76|104->76|104->76|105->77|105->77|105->77|105->77|109->81|110->82|110->82|110->82|112->84|112->84|112->84|112->84|112->84|112->84|113->85|113->85|113->85|114->86|114->86|114->86|114->86|114->86|114->86|115->87|115->87|115->87|116->88|116->88|116->88|116->88|117->89|117->89|117->89|118->90|118->90|118->90|124->96|126->98|128->100|139->111|139->111|139->111|139->111|156->128|156->128|159->131|159->131|160->132|160->132|163->135|163->135|169->141|169->141|181->153|181->153|186->158|186->158|189->161|189->161|190->162|190->162|207->179|207->179|208->180|208->180|212->184|212->184|213->185|213->185|215->187|215->187|216->188|216->188|218->190|218->190|225->197
                    -- GENERATED --
                */
            