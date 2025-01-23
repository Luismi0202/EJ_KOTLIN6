fun main(){
    val repositorio1 = RepositorioCompra()
    val cliente1 = Cliente("Juan",Domicilio("Federico Chueca",14))
    repositorio1.agregarCompra(cliente1,Compra(cliente1,7,12.44))

    println(repositorio1.domicilios())
}