
public class Produto {
int id;
String nome;
float preco;
public int getId() {
	return id;
}
public void setId(int id) {
	if (id<=0) {
		throw new MyException ("valor di invalido");
	}
	this.id = id;
}
public String getNome() {
	return nome;
}
public void setNome(String nome) {
	if ((nome==null) || (nome.length()==0)) {
		throw new MyException ("valor para nome invalido");
	}
	this.nome = nome;
}
public float getPreco() {
	return preco;
}
public void setPreco(float preco) {
	if (preco<0) {
		throw new MyException ("nao pode ser negativo");
	}
	this.preco = preco;
}

}
