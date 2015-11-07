// @SOURCE:/home/pedro/UFCG/SI1/activator-dist-1.3.6/lab2si/conf/routes
// @HASH:55ff369932625d0a6ea224529319e33edc322494
// @DATE:Mon Nov 02 16:04:04 BRT 2015


import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString

object Routes extends Router.Routes {

private var _prefix = "/"

def setPrefix(prefix: String) {
  _prefix = prefix
  List[(String,Routes)]().foreach {
    case (p, router) => router.setPrefix(prefix + (if(prefix.endsWith("/")) "" else "/") + p)
  }
}

def prefix = _prefix

lazy val defaultPrefix = { if(Routes.prefix.endsWith("/")) "" else "/" }


// @LINE:6
private[this] lazy val controllers_Application_index0 = Route("GET", PathPattern(List(StaticPart(Routes.prefix))))
        

// @LINE:7
private[this] lazy val controllers_Application_formularioNovoAnuncio1 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("anuncio/novo"))))
        

// @LINE:8
private[this] lazy val controllers_Application_novoAnuncio2 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("anuncio/novo"))))
        

// @LINE:9
private[this] lazy val controllers_Application_buscar3 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("buscar"))))
        

// @LINE:10
private[this] lazy val controllers_Application_showAnuncio4 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("show"))))
        

// @LINE:11
private[this] lazy val controllers_Application_deletarAnuncio5 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("delete"))))
        

// @LINE:12
private[this] lazy val controllers_Application_adicionarPergunta6 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("show"))))
        

// @LINE:13
private[this] lazy val controllers_Application_adicionarResposta7 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("show/duvida"))))
        

// @LINE:17
private[this] lazy val controllers_Assets_at8 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("assets/"),DynamicPart("file", """.+""",false))))
        
def documentation = List(("""GET""", prefix,"""controllers.Application.index()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """anuncio/novo""","""controllers.Application.formularioNovoAnuncio()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """anuncio/novo""","""controllers.Application.novoAnuncio()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """buscar""","""controllers.Application.buscar()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """show""","""controllers.Application.showAnuncio(id:Long)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """delete""","""controllers.Application.deletarAnuncio(id:Long)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """show""","""controllers.Application.adicionarPergunta(id:Long)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """show/duvida""","""controllers.Application.adicionarResposta(anuncioId:Long, duvidaId:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)""")).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
  case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
  case l => s ++ l.asInstanceOf[List[(String,String,String)]] 
}}
      

def routes:PartialFunction[RequestHeader,Handler] = {

// @LINE:6
case controllers_Application_index0(params) => {
   call { 
        invokeHandler(controllers.Application.index(), HandlerDef(this, "controllers.Application", "index", Nil,"GET", """ Home page""", Routes.prefix + """"""))
   }
}
        

// @LINE:7
case controllers_Application_formularioNovoAnuncio1(params) => {
   call { 
        invokeHandler(controllers.Application.formularioNovoAnuncio(), HandlerDef(this, "controllers.Application", "formularioNovoAnuncio", Nil,"GET", """""", Routes.prefix + """anuncio/novo"""))
   }
}
        

// @LINE:8
case controllers_Application_novoAnuncio2(params) => {
   call { 
        invokeHandler(controllers.Application.novoAnuncio(), HandlerDef(this, "controllers.Application", "novoAnuncio", Nil,"POST", """""", Routes.prefix + """anuncio/novo"""))
   }
}
        

// @LINE:9
case controllers_Application_buscar3(params) => {
   call { 
        invokeHandler(controllers.Application.buscar(), HandlerDef(this, "controllers.Application", "buscar", Nil,"GET", """""", Routes.prefix + """buscar"""))
   }
}
        

// @LINE:10
case controllers_Application_showAnuncio4(params) => {
   call(params.fromQuery[Long]("id", None)) { (id) =>
        invokeHandler(controllers.Application.showAnuncio(id), HandlerDef(this, "controllers.Application", "showAnuncio", Seq(classOf[Long]),"GET", """""", Routes.prefix + """show"""))
   }
}
        

// @LINE:11
case controllers_Application_deletarAnuncio5(params) => {
   call(params.fromQuery[Long]("id", None)) { (id) =>
        invokeHandler(controllers.Application.deletarAnuncio(id), HandlerDef(this, "controllers.Application", "deletarAnuncio", Seq(classOf[Long]),"POST", """""", Routes.prefix + """delete"""))
   }
}
        

// @LINE:12
case controllers_Application_adicionarPergunta6(params) => {
   call(params.fromQuery[Long]("id", None)) { (id) =>
        invokeHandler(controllers.Application.adicionarPergunta(id), HandlerDef(this, "controllers.Application", "adicionarPergunta", Seq(classOf[Long]),"POST", """""", Routes.prefix + """show"""))
   }
}
        

// @LINE:13
case controllers_Application_adicionarResposta7(params) => {
   call(params.fromQuery[Long]("anuncioId", None), params.fromQuery[Long]("duvidaId", None)) { (anuncioId, duvidaId) =>
        invokeHandler(controllers.Application.adicionarResposta(anuncioId, duvidaId), HandlerDef(this, "controllers.Application", "adicionarResposta", Seq(classOf[Long], classOf[Long]),"POST", """""", Routes.prefix + """show/duvida"""))
   }
}
        

// @LINE:17
case controllers_Assets_at8(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        invokeHandler(controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """ Map static resources from the /public folder to the /assets URL path""", Routes.prefix + """assets/$file<.+>"""))
   }
}
        
}

}
     