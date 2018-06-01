import java.lang.Math.abs
import java.lang.Math.sqrt
import java.util.*

class MyClass( var name : String = "John", var hp : Double = 100.0, var xp : Int = 0, var lvl : Int = 1,
               var nextLvl : Int = 100, var maxHp : Double = 100.0)
{
    public fun DeathPenalty()
    {
        xp /= 2
        hp = maxHp * 0.05
    }
    public var Inv : Array<String> = Array(10){i->""}
    fun StarterBackpack()
    {
        Inv[0] = "Sock x2";
    }
}
fun main(args: Array<String>)
{
    var player : MyClass = MyClass(maxHp = 200.0, xp = 600)
    player.DeathPenalty()
    println(player.hp)
    println(player.xp)
}

fun sum( int1 : Int, int2: Int): Int = int1 + int2

fun calcTaxes(value: Double = 8.0, taxP: Double = 5.0): Double{
    return taxP * value
}

fun squar(a: Double, b: Double):Double{
    return a * b
}

fun Pif(x1: Double, y1: Double, x2: Double, y2: Double): Double{
    return sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2))
    
}


/* print("Input Name: ")
    val name = readLine()
    print("Input Surname: ")
    val surname = readLine()
    if (name != null && surname != null)
        print("Fullname: ${name} ${surname}\n")
    print("Input A: ")
    val a = readLine()
    print("Input B: ")
    val b = readLine()
    if (a != null && b != null) print(squar( a.toDouble(), b.toDouble()))
    print(Pif(args[0].toDouble(),args[1].toDouble(),args[2].toDouble(),args[3].toDouble()))
    var sum: Int = 0
    for(temp in args){
        println(temp)
        sum += temp.toInt()
    }
    print(sum.toDouble()/args.size)
    val arr = Array(10, {i: Int -> Math.abs(Random().nextInt()%10)})
    for(i in 0..2){
        for(j in 2 downTo 0)
            print("${j}${i} ")
        print("\n")}
    val s = "Смешанные чувства теснятся в груди моей, когда я приступаю к описанию этой экспедиции, принесшей мне больше, нежели я мог надеяться. Отправляясь в путь с Земли, я назначил себе целью достижение невероятно далекой планеты в созвездии Краба, Зазьявы, слава о которой разносится по всей космической пустоте благодаря тому, что она подарила Вселенной одну из наиболее выдающихся ее личностей, Учителя Ох. Не так на самом деле зовут сего блестящего мыслителя, я же пользуюсь этим именем, ибо ни один земной язык не в состоянии передать его иным образом. Ребенку, рождающемуся на Зазьяве, вместе с необыкновенно длинным, по нашим представлениям, именем присваивают несметное множество титулов и отличий.\n" +
            "Когда в свое время Учитель Ох пришел в мир, его нарекли именем Гридипидагититоситипопокартуртегвауана-топочтоэтотам. Он получил титулы Златотканого Оплота Бытия, Доктора Совершенной Кротости, Светлой Вероятностной Всесторонности и т.д. и т.п. По мере того как он мужал и учился, каждый год его лишали одного титула и частички имени, а поскольку способности он выказывал необычайные, уже на тридцать третьем году жизни у него отобрали последнее отличие, спустя же еще два года у него вообще не осталось титулов, а имя его обозначалось одной только – да к тому же немой – буквой зазьявского алфавита: «придыхание блаженства», то есть особого рода подавленный вздох, который издают от избытка уважения и наслаждения."
    val array = s.split(" ")
    println(array.size)
    val array1 = s.split(".")
    println(array1.size)*/