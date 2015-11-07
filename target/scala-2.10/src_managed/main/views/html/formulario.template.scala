
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
object formulario extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[String,Form[Anuncio],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(message: String)(formAnuncio: Form[Anuncio]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._


Seq[Any](format.raw/*1.47*/("""
"""),format.raw/*3.1*/(""" 
"""),_display_(Seq[Any](/*4.2*/main("Cadastrar Anuncio")/*4.27*/ {_display_(Seq[Any](format.raw/*4.29*/("""
  """),_display_(Seq[Any](/*5.4*/helper/*5.10*/.form(routes.Application.novoAnuncio)/*5.47*/ {_display_(Seq[Any](format.raw/*5.49*/("""

  """),_display_(Seq[Any](/*7.4*/if(!message.isEmpty())/*7.26*/ {_display_(Seq[Any](format.raw/*7.28*/("""
                    <script>

                    
                    alert(""""),_display_(Seq[Any](/*11.29*/message)),format.raw/*11.36*/("""");


                    </script>
  """)))})),format.raw/*15.4*/("""

  	<link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*17.49*/routes/*17.55*/.Assets.at("stylesheets/style.css"))),format.raw/*17.90*/("""">
    <style>
        body"""),format.raw/*19.13*/("""{"""),format.raw/*19.14*/("""background: #fff url(""""),_display_(Seq[Any](/*19.37*/routes/*19.43*/.Assets.at("images/background.png"))),format.raw/*19.78*/("""");"""),format.raw/*19.81*/("""}"""),format.raw/*19.82*/(""" 
        #signup-form"""),format.raw/*20.21*/("""{"""),format.raw/*20.22*/("""border-radius: 10px;"""),format.raw/*20.42*/("""}"""),format.raw/*20.43*/("""
    </style>

  	<div id="signup-form">
        
        <!--BEGIN #subscribe-inner -->
        <div id="signup-inner">
        
        	<div class="clearfix" id="header">
        	
        		<img id="signup-icon" src=""""),_display_(Seq[Any](/*30.39*/routes/*30.45*/.Assets.at("images/music.png"))),format.raw/*30.75*/("""" alt="">
        
                <h1>Anúncio de contato</h1>

            
            </div>
    
    		<form id="send" action="">
	
	   			<p>
                <label>Identificador(necessário para se finalizar o anúncio) *</label>
                <input name="idDelete" type="text" class="form-control" required>
                </p>

	   			<p>
                <label>Título *</label>
                <input name="titulo" type="text" class="form-control" required>
                </p>
	  			<p>
                <label>Descrição do anúncio *</label>
                <textarea name="descricao" cols="30" rows="10" class="form-control" required></textarea>

                </p>

                <p>
               	<label>Forma que deseja tocar *</label><br>
                   
                   <div style="position: static; left: 0px;">
	                   <input type="radio" name="tipo" value="Tocar em banda" checked>Tocar em banda
						<br>
						<input type="radio" name="tipo" value="Tocar ocasionalmente">Tocar ocasionalmente

						
					</div>
                    
                </p>
                <div id="instruments">
                     
                    <label>Quais instrumentos você toca? *</label>
                    
                    <input name="instrumentos" type="text" class="form-control" placeholder="violão, bateria, guitarra,..." required>
                    
                    
                    
                    
                    
                <p>
                </div>
                <div id="likeStyle">
               
                    <label>Quais os estilos musicais você gosta de tocar? *</label>
                    
                    <input name="estilosQueGosta" type="text" class="form-control" placeholder="forró, sertanejo, rock,..." required>
                    
                    
                </p>

                </div>

                <div id="noLikeStyle">
               
                    <label>Quais os estilos musicais você NÃO gosta de tocar? *</label>
                    
                    <input name="estilosQueNaoGosta" type="text" class="form-control" placeholder="forró, sertanejo, rock,..."
                    required>
                    
                </p>
                </div>

                <label>Email *</label>
                <input name="email" type="text" class="form-control" required>
                </p>
                
                <p>
                <label>Facebook</label>
                <input name="facebook" class="form-control" type="text">
                </p>
                
                
                
                <p>
                <label>Endereço *</label>
                <input name="endereco" type="text" class="form-control" required>
                </p>

	   			<script type="text/javascript">

                	function addElement(name, id)"""),format.raw/*117.47*/("""{"""),format.raw/*117.48*/("""
                		//alert($( id ).text());
      //           		var theDiv = document.getElementById(id);
						// var content = document.createTextNode('<input name="'+name+'" type="text" class="form-control" required><br><br>');
						// theDiv.appendChild(content);
                		$( id ).append('<input name="'+name+'" type="text" class="form-control" required><br><br>');
                     //document.getElementById(id).innerHTML += '<input name="'+name+'" type="text" class="form-control" required><br><br>';
                """),format.raw/*124.17*/("""}"""),format.raw/*124.18*/("""
                        

            	</script>
	 
	   
    			<input type="submit" value="Criar">
    		</form>
    		<div>
				<p>* Obrigatório<br>
				</p>
			</div>


        </div>
        
        <!--END #signup-inner -->
    </div>
  """)))})),format.raw/*142.4*/("""
""")))})))}
    }
    
    def render(message:String,formAnuncio:Form[Anuncio]): play.api.templates.HtmlFormat.Appendable = apply(message)(formAnuncio)
    
    def f:((String) => (Form[Anuncio]) => play.api.templates.HtmlFormat.Appendable) = (message) => (formAnuncio) => apply(message)(formAnuncio)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Oct 27 22:36:19 BRT 2015
                    SOURCE: /home/pedro/UFCG/SI1/activator-dist-1.3.6/lab2si/app/views/formulario.scala.html
                    HASH: fdb4276a8e679f3d669f039b7cc73b71f37c85dc
                    MATRIX: 793->1|948->46|975->64|1012->67|1045->92|1084->94|1122->98|1136->104|1181->141|1220->143|1259->148|1289->170|1328->172|1444->252|1473->259|1543->298|1629->348|1644->354|1701->389|1756->416|1785->417|1844->440|1859->446|1916->481|1947->484|1976->485|2026->507|2055->508|2103->528|2132->529|2390->751|2405->757|2457->787|5400->3701|5430->3702|5997->4240|6027->4241|6304->4486
                    LINES: 26->1|30->1|31->3|32->4|32->4|32->4|33->5|33->5|33->5|33->5|35->7|35->7|35->7|39->11|39->11|43->15|45->17|45->17|45->17|47->19|47->19|47->19|47->19|47->19|47->19|47->19|48->20|48->20|48->20|48->20|58->30|58->30|58->30|145->117|145->117|152->124|152->124|170->142
                    -- GENERATED --
                */
            