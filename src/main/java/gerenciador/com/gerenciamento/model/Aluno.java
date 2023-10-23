package gerenciador.com.gerenciamento.model;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.Set;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "tb_aluno")// - serve pra mudar o nome da tabela
public class Aluno {
    @OneToOne
    private Set<Turma> turma;
}
