package gerenciador.com.gerenciamento.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "tb_turma")// - serve pra mudar o nome da tabela
public class Turma {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @OneToMany
    private Set<Aluno> alunos;
    @OneToMany
    private Set<Professor> professores;

}
