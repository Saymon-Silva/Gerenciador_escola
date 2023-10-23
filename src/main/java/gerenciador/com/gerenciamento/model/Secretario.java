package gerenciador.com.gerenciamento.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "tb_secretario")// - serve pra mudar o nome da tabela
public class Secretario {
    private Integer quantidadeBoletim;
}
