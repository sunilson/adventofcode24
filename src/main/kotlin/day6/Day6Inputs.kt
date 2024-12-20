package day6

val INPUT_DAY_6 = """
..#.....................#............#....#...........#...............................#.....#.....................................
.................#............................#.............##..#...............................#....#..#.........#...............
.............................................##.........................................#....................#...............#...#
...##....................#...............#.....#....................#......##..............#............................#....#....
.................................#..#..............#...........#.............#..#........................#............#...........
.................#.........................#...........................#........................#........................#........
...#....................................#....#.........#................#...............#.....#................#.....#............
.............#.#..........................................................#...#..................#....#.......#.....#...#.........
.....#........................#....##...#............................................................#............................
..................#...#.........................................#..................#.............................#.#........#.....
......#...............................#.#..........##..#...........#.........................#.......#....................#.......
.................................#..............#...............#........#..........#.........#............#.........#.......#...#
..#..#............#...#.....................#...............#............#.#........................#........#...............#....
..............#..#.#........................#.........#...........##.......#..........#.....................#..............#...#..
..........................#.................##...................................#....#.........#.................................
..................#..#........#....#...............#..............#.......#.......#......................................#..#...#.
..........#.#.................#.........#...................#.......................##......#....................#.......#........
..........#.........#...#......................................................................#.....#............#........#......
...##.............#...........................................................#..#....................##.#...#.#..#.........#..#..
.....#......#.............................#.......#...#...#...............#.....#............#........#..#.#......................
........#................#.........#.......................................................................#..........#...........
.......#........................................#..........#...............................#..#...................................
..................##.......#.......#.....#............#.......#...#.........#....##...............#..#.............#..........#...
.......#...........#...........#...........................#.............#.........#..#........................#.##...............
.....................................................................#........#....#...........................................#..
....#...........#......#.........#....................................#.................................#......#..................
...#........................................#..#...............................#.....................#.#......#...................
..#.....#.................................#.................#....#............................................#......#............
...................................................##...........#.......#.............#.................#.......#.................
..........................................................##..............#....#....#.............#...............................
........................................................#.....................................#................................#..
..............##....#..#..........#...........#......#..#....#.......#................#............................#..#...#.......
..........................#....................#.................................................#................................
#................................................#.....................#..#...............##........#...#...#.........#...........
...........#.................................#..#....................#.#.......#..........................#.......#.......#.......
..............................#......#......#.................#.................#.................#.#.............#..#.#..........
.......................#....................#....................................#.....#.#.......#............................#...
...............................................................................................#.#................................
#..................#.....#...............................#..............#...#.....................................................
..........................................................#.................................................#.....................
..........#.........................#.....................................................#.........#..........#................#.
........#..............#..#......................................#.........#............#.................................#.......
.......#.........................................................#.........#................#...............................#.....
...........#............................................#...#.............................#.....^................................#
................#.............#...#..............................#..................................#.............................
.........................................................................................................#........................
.................................................#........#.......................#.#.....#......................#................
.........#.........#...#....................................................#.....................................................
##.##..#...................................#......................................................................................
.................#...........................................................................................#........#...........
.........................................................................#........................#....#......................#...
..............#......................#........#..........................#.........#..............................................
.......................#............................................................................##............................
.....#.................#........#...#...............#.............................#......................#........................
....#...................................................................................#............##...........................
................#............................#............................................#.......................................
.......................................................................................................#......#...................
......................................................................................#...#.......................................
...............................................#........#..........#............................#..............#.......#..........
..............#.....................#........#..#............................#...#..#.#...................................#.......
..........#...............................#............................#...........................................#..............
....#............#.#....#......................................................................#..................................
.......................#.......................#................................#..............#.....................#.........#..
...........#.........................#.............#.#........#........#..........................................#...............
.......#......................#....................#...............................#......................#...........#...........
............#.....................................................................................................................
....#.......#............................................................#.........#.............#..........#....#..........#.....
.......#.........................................................................#..................#..#....#.......#.............
............................#....#.......#......#.......#.....................#.................#.................................
.......................................................#.............#..........................#.................................
....................................#.....................................##......................#............................#..
..............#...............#....................#.......................#................#......................#..............
....................#...........................#...................................................................#.............
...#..........................#...........................#............................................................#..........
..............#.................#.............................#..#.......#.......................#.##.............................
....................#.....#...#..............................................#......#...........#.................#..#....#.......
#......................................#.....................#..#..#.#...........#.............#.................................#
.....................#...........................................................#..........#............##..........#............
.......#..................................#...............#..........#....#...................................................#...
.............#.................#...........................#..............#.................................................#.....
...............................#......................................##...................................#.#......#..........#..
.................##....................#.................................................#......................#................#
........#....................................#..........#.........................#..................#......................#.....
...#....#...........................#..............................#.#..........................#.................................
.#...................................#..#......#.................................................................#................
.................................#...........#................#.#........................#....................................##..
#..#.....##...............#................................................................#....#......#.........................#
.#....#......................................................#.........................#.......................................#..
.#..............................................#.................................................................#...............
...............#..........................................#...#...............................#.#..#.#........#...................
..............#................................#.......#..................................#.........................#........#....
.......................##..................................................#......................................................
..............................#...............................##..................................................................
#....................#...........................................................#.............................#..................
#..................................................................#...#..........................................................
#..#........#...................................#..#..........##..............#...................................................
.......................#.....................#....................................................................................
.....................#...........#.............................................................#........................#....#....
...............#............................................................................##...#..........................#.....
...#......................................#.......................................................................................
....#...........................#.........#.................................................#..........#...#........#....#........
......#....#.#............................#..........................................#........................................#...
...........#...#.............................................#......................#..................#.....................#....
...#..........#........#..........#.......#..............#.............................#.......................#................#.
...........#...............#...........................................................#..........................................
..#..........##.................................................#...#...............#.......................#...............##....
.......................#..............#.............#......................................................#..................#...
..............#..#........##..........#...................................................#.............##....................#...
...................#..................................................#................#......#.....#.........#.#...#.............
..................#.................................................#.................................................#.........#.
......................................#.#........#.....#...#..........#..............#.........................#...#..............
.................................#..............#..#.....................#................#.............#..#..#...................
.........#.......#.#..............#..#...............#.................#..................................#..#....................
.............................#....#.......##..................................................................................##..
.....................................................................................#........#.......#......#....................
........#...........#..........#..........#............................#...............#........#.#...........................#...
.#.................#...#..............#...#...................#........#...............#..........................................
.........#............................................##........#......#.....................#.......................#............
.......................................#..........#..#......#........#..........#..........................#....................#.
....#......#..........................#....................#.......................................#.....###.......#..............
.......#..................#....#.......................................................................#..........................
....#........................#.............................................................#.......#..........................#...
......................#.................................#..........#................#..#.........................#................
...........#....................................................#..............#...........................#......................
.....#................#........#...#....#........#............#...............#.......................#..#.........#..............
#..................................................#...........................#....#...........#.................................
....#.#.....................................#.#...............#................#....................................#.............
............#....................#.#.#...............................................#...................##.......................
...##..............#........................#.............#.......#...........#.#.##..............................#....##.........
......#...........#....................................................#.........................##...............................
""".trimIndent()