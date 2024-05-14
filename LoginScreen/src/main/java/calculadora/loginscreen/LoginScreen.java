package calculadora.loginscreen;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * Esta classe representa a tela de login de um sistema. Ela permite aos
 * usuários realizar login e adicionar novos usuários ao banco de dados.
 *
 * @author Jean Israel
 * @version 1.1
 * @since Release 1.1 da aplicação 
 */
public class LoginScreen {

    private Map<String, String> userDatabase; // //Simulado do usuario para o banco de dados (username,  password)

    /**
     * Construtor da classe LoginScreen. Inicializa o banco de dados de usuários
     * com valores padrão.
     */
    public LoginScreen() {
        userDatabase = new HashMap<>();
        userDatabase.put("john", "password123");
        userDatabase.put("alice", "securepass");
    }

    /**
     * Verifica se o usuário pode fazer login com o nome de usuário e senha
     * fornecidos.
     *
     * @param username O nome de usuário fornecido pelo usuário.
     * @param password A senha fornecida pelo usuário.
     * @return true se o login for bem-sucedido, caso contrário, false.
     */
    public boolean login(String username, String password) {
        if (userDatabase.containsKey(username)) {
            String storedPassword = userDatabase.get(username);
            if (storedPassword.equals(password)) {
                return true; //Autenticação com sucesso
            }
        }
        return false; //Autenticação falhou
    }

    /**
     * Adiciona um novo usuário ao banco de dados.
     *
     * @param username O nome de usuário para um novo usuário.
     * @param password A senha do novo usuário.
     */
    public void addUser(String username, String password) {
        userDatabase.put(username, password);
    }

}
