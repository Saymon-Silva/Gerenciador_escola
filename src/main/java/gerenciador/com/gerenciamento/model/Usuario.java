package gerenciador.com.gerenciamento.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "tb_usuario")
public class Usuario {
    private String nome;
    private Integer idade;
    private String endereco;
}