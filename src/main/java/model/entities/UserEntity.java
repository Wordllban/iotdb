package model.entities;

import lombok.*;

import javax.persistence.*;
import java.util.Collection;

@Table(name = "user")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(of = "id")
@ToString
@Entity
public class UserEntity {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
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
  @OneToMany(mappedBy = "userId", fetch = FetchType.EAGER)
  private Collection<BookingRecordEntity> bookingRecords;

  public UserEntity(Integer id, String name, String surname, String mail, String userBankAccount){
    this.id = id;
    this.name = name;
    this.surname = surname;
    this.mail = mail;
    this.userBankAccount = userBankAccount;
  }

  @Override
  public String toString() {
    return "UserEntity{" +
        "id=" + id +
        ", name='" + name + '\'' +
        ", surname='" + surname + '\'' +
        ", mail='" + mail + '\'' +
        ", userBankAccount='" + userBankAccount + '\'' +
        '}' + "\n";
  }

}
