// @SOURCE:/home/pedro/si1/play-bd-e-testes/conf/routes
// @HASH:2ee7be419f25c36e3bc4832dbf140ad3280bb118
// @DATE:Fri Jun 05 23:08:20 BRT 2015

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString


// @LINE:15
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
package controllers {

// @LINE:15
class ReverseAssets {
    

// @LINE:15
def at(file:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                                                
    
}
                          

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
                  


// @LINE:15
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
package controllers.javascript {

// @LINE:15
class ReverseAssets {
    

// @LINE:15
def at : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                        
    
}
              

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
        


// @LINE:15
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
package controllers.ref {


// @LINE:15
class ReverseAssets {
    

// @LINE:15
def at(path:String, file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]), "GET", """ Map static resources from the /public folder to the /assets URL path""", _prefix + """assets/$file<.+>""")
)
                      
    
}
                          

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
        
    