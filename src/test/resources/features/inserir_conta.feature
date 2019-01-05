#language: pt

@funcionais
Funcionalidade: Cadastro de contas

Como um usuário 
Gostaria de cadastrar contas
Para que eu possa distribuir meu dinheiro de uma forma mais organizada

# o Contexto irá executar para todos os cenários
Contexto: 

# CENÁRIO DECLARATIVO
	Dado que desejo adicionar uma conta
	
# CENÁRIO IMPERATIVO
#	Dado que estou acessando a aplicação
#	Quando informo o usuário "wcrodrigo@hotmail.com"
#	E a senha "jesuseuteamo"
#	E seleciono entrar
#	Então visualizo a página inicial
#	Quando seleciono Contas
#	E seleciono Adicionar

Esquema do Cenário: Deve validar regras cadastro contas

# CENÁRIO DECLARATIVO
	Quando adiciono a conta "<conta>"
	Então recebo a mensagem "<mensagem>"

# CENÁRIO IMPERATIVO
#	Quando informo a conta "<conta>"
#	E seleciono Salvar
#	Então recebo a mensagem "<mensagem>"


Exemplos:
	| 		conta 		   | 				       mensagem 			 			|
	| Conta de Teste   | Conta adicionada com sucesso! 			|
	|  							 	 | Informe o nome da conta 						|
	| Conta mesmo nome | Já existe uma conta com esse nome! |
	