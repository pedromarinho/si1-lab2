// @SOURCE:/home/pedro/UFCG/SI1/activator-dist-1.3.6/lab2si/conf/routes
// @HASH:55ff369932625d0a6ea224529319e33edc322494
// @DATE:Mon Nov 02 16:04:04 BRT 2015

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString


// @LINE:17
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
package controllers {

// @LINE:17
class ReverseAssets {
    

// @LINE:17
def at(file:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                                                
    
}
                          

// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
class ReverseApplication {
    

// @LINE:11
def deletarAnuncio(id:Long): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "delete" + queryString(List(Some(implicitly[QueryStringBindable[Long]].unbind("id", id)))))
}
                                                

// @LINE:10
def showAnuncio(id:Long): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "show" + queryString(List(Some(implicitly[QueryStringBindable[Long]].unbind("id", id)))))
}
                                                

// @LINE:13
def adicionarResposta(anuncioId:Long, duvidaId:Long): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "show/duvida" + queryString(List(Some(implicitly[QueryStringBindable[Long]].unbind("anuncioId", anuncioId)), Some(implicitly[QueryStringBindable[Long]].unbind("duvidaId", duvidaId)))))
}
                                                

// @LINE:12
def adicionarPergunta(id:Long): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "show" + queryString(List(Some(implicitly[QueryStringBindable[Long]].unbind("id", id)))))
}
                                                

// @LINE:7
def formularioNovoAnuncio(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "anuncio/novo")
}
                                                

// @LINE:8
def novoAnuncio(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "anuncio/novo")
}
                                                

// @LINE:9
def buscar(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "buscar")
}
                                                

// @LINE:6
def index(): Call = {
   Call("GET", _prefix)
}
                                                
    
}
                          
}
                  


// @LINE:17
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
package controllers.javascript {

// @LINE:17
class ReverseAssets {
    

// @LINE:17
def at : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                        
    
}
              

// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
class ReverseApplication {
    

// @LINE:11
def deletarAnuncio : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.deletarAnuncio",
   """
      function(id) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "delete" + _qS([(""" + implicitly[QueryStringBindable[Long]].javascriptUnbind + """)("id", id)])})
      }
   """
)
                        

// @LINE:10
def showAnuncio : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.showAnuncio",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "show" + _qS([(""" + implicitly[QueryStringBindable[Long]].javascriptUnbind + """)("id", id)])})
      }
   """
)
                        

// @LINE:13
def adicionarResposta : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.adicionarResposta",
   """
      function(anuncioId,duvidaId) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "show/duvida" + _qS([(""" + implicitly[QueryStringBindable[Long]].javascriptUnbind + """)("anuncioId", anuncioId), (""" + implicitly[QueryStringBindable[Long]].javascriptUnbind + """)("duvidaId", duvidaId)])})
      }
   """
)
                        

// @LINE:12
def adicionarPergunta : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.adicionarPergunta",
   """
      function(id) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "show" + _qS([(""" + implicitly[QueryStringBindable[Long]].javascriptUnbind + """)("id", id)])})
      }
   """
)
                        

// @LINE:7
def formularioNovoAnuncio : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.formularioNovoAnuncio",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "anuncio/novo"})
      }
   """
)
                        

// @LINE:8
def novoAnuncio : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.novoAnuncio",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "anuncio/novo"})
      }
   """
)
                        

// @LINE:9
def buscar : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.buscar",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "buscar"})
      }
   """
)
                        

// @LINE:6
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.index",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + """"})
      }
   """
)
                        
    
}
              
}
        


// @LINE:17
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
package controllers.ref {


// @LINE:17
class ReverseAssets {
    

// @LINE:17
def at(path:String, file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]), "GET", """ Map static resources from the /public folder to the /assets URL path""", _prefix + """assets/$file<.+>""")
)
                      
    
}
                          

// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
class ReverseApplication {
    

// @LINE:11
def deletarAnuncio(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.deletarAnuncio(id), HandlerDef(this, "controllers.Application", "deletarAnuncio", Seq(classOf[Long]), "POST", """""", _prefix + """delete""")
)
                      

// @LINE:10
def showAnuncio(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.showAnuncio(id), HandlerDef(this, "controllers.Application", "showAnuncio", Seq(classOf[Long]), "GET", """""", _prefix + """show""")
)
                      

// @LINE:13
def adicionarResposta(anuncioId:Long, duvidaId:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.adicionarResposta(anuncioId, duvidaId), HandlerDef(this, "controllers.Application", "adicionarResposta", Seq(classOf[Long], classOf[Long]), "POST", """""", _prefix + """show/duvida""")
)
                      

// @LINE:12
def adicionarPergunta(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.adicionarPergunta(id), HandlerDef(this, "controllers.Application", "adicionarPergunta", Seq(classOf[Long]), "POST", """""", _prefix + """show""")
)
                      

// @LINE:7
def formularioNovoAnuncio(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.formularioNovoAnuncio(), HandlerDef(this, "controllers.Application", "formularioNovoAnuncio", Seq(), "GET", """""", _prefix + """anuncio/novo""")
)
                      

// @LINE:8
def novoAnuncio(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.novoAnuncio(), HandlerDef(this, "controllers.Application", "novoAnuncio", Seq(), "POST", """""", _prefix + """anuncio/novo""")
)
                      

// @LINE:9
def buscar(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.buscar(), HandlerDef(this, "controllers.Application", "buscar", Seq(), "GET", """""", _prefix + """buscar""")
)
                      

// @LINE:6
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.index(), HandlerDef(this, "controllers.Application", "index", Seq(), "GET", """ Home page""", _prefix + """""")
)
                      
    
}
                          
}
        
    