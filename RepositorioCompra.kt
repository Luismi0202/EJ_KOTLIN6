class RepositorioCompra() {
    var repositorio: MutableMap<String,Compra> = mutableMapOf()
    fun agregarCompra(cliente:Cliente,compra:Compra){
        repositorio[cliente.domicilio.dirCompleta()] = compra
    }
    fun domicilios():MutableSet<String>{
        var domiciliosUnicos:MutableSet<String> = mutableSetOf()
        for(domicilio in repositorio.keys){
            domiciliosUnicos.add(domicilio)
        }
        return domiciliosUnicos
    }
}