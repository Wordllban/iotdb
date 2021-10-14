package passive.model.entities;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "user")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(of = "id")
@ToString
public class UserEntity {
  @Id
  @Column(name = "id")
  private Integer id;
  @Column(name = "name", length = 45)
  private String name;
  @Column(name = "surname", length = 45)
  private String surname;
  @Column(name = "mail", length = 45)
  private String mail;
  @Column(name = "user_bank_account", length = 16)
  private String userBankAccount;
}
