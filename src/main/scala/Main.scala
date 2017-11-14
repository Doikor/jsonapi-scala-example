import spray.json.DefaultJsonProtocol._
import com.qvantel.jsonapi._

object Main extends App {
  implicit val apiRoot: ApiRoot = ApiRoot(None)

  @jsonApiResource final case class Employee(id: String, name: String)
  @jsonApiResource final case class Company(id: String, name: String, employees: ToMany[Employee])

  val acme = Company("1", "acme", ToMany.loaded(Seq(Employee("1", "number one 1"))))

  val json = rawOne(acme)
  val parsed = readOne[Company](json, Set("employees"))

  println(acme == parsed)
}
