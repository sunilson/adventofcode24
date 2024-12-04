package day2

val INPUT_DAY_2 = """
        85 86 87 88 85
        30 32 35 36 36
        75 77 79 81 84 87 91
        9 11 13 15 16 18 21 27
        72 73 76 75 77 80 81
        7 9 8 11 12 10
        95 97 98 95 95
        64 67 68 69 70 67 68 72
        5 7 5 8 14
        33 35 35 38 39 41 43
        88 89 92 93 96 96 98 96
        62 65 67 70 72 72 72
        83 86 89 92 93 93 95 99
        27 28 30 31 31 38
        31 33 34 38 40 42
        32 34 36 40 38
        12 13 14 16 20 22 22
        31 32 34 38 39 43
        44 47 48 50 53 57 60 65
        22 25 26 33 35
        6 8 15 18 15
        49 52 55 62 62
        39 41 42 48 50 51 53 57
        41 42 44 47 53 54 59
        48 47 50 51 52 54 57 58
        24 22 23 24 26 23
        33 30 32 33 33
        49 47 50 53 55 59
        15 12 14 16 23
        87 85 82 83 85 87
        48 47 49 46 47 45
        13 11 8 10 10
        50 47 44 47 51
        78 77 79 81 83 86 84 91
        41 39 41 41 44
        15 12 15 15 16 17 15
        60 57 60 60 63 63
        22 20 21 21 24 28
        87 86 88 88 90 93 98
        13 12 14 18 20
        72 70 74 75 78 79 77
        51 50 53 54 58 58
        69 67 68 71 72 75 79 83
        7 5 7 9 13 15 18 24
        34 32 34 40 41
        6 4 7 9 11 18 16
        31 29 32 35 40 42 42
        64 63 65 71 73 76 79 83
        63 60 63 65 70 76
        22 22 23 26 29 31 34
        34 34 35 37 34
        66 66 68 70 71 71
        16 16 18 21 24 26 30
        55 55 56 58 59 60 67
        76 76 77 78 77 80
        19 19 16 18 17
        37 37 40 43 44 47 46 46
        17 17 16 18 20 22 26
        10 10 12 9 12 18
        3 3 3 6 9
        34 34 36 39 40 40 39
        19 19 20 23 23 26 26
        28 28 31 31 35
        36 36 37 37 39 44
        75 75 78 79 80 82 86 89
        23 23 24 28 29 31 30
        30 30 34 36 37 38 41 41
        10 10 12 13 17 18 22
        25 25 27 31 33 34 40
        1 1 8 10 11 12
        11 11 14 15 20 19
        76 76 79 86 86
        79 79 86 88 92
        64 64 67 68 70 73 80 87
        4 8 10 11 12
        46 50 52 54 55 57 59 58
        46 50 51 52 55 58 60 60
        22 26 29 32 36
        62 66 67 68 71 73 79
        56 60 63 64 63 66 67
        49 53 55 58 57 56
        27 31 34 31 31
        73 77 75 78 81 85
        10 14 16 17 16 23
        64 68 71 71 72 75 77 78
        38 42 43 43 42
        12 16 16 19 20 20
        65 69 71 73 76 77 77 81
        47 51 52 53 53 56 58 64
        25 29 31 34 36 39 43 44
        13 17 18 22 23 25 22
        30 34 38 39 41 41
        28 32 36 39 42 43 47
        32 36 39 41 45 46 53
        77 81 88 91 94
        63 67 68 69 76 74
        25 29 34 37 39 39
        74 78 79 84 85 86 90
        14 18 23 24 26 31
        35 41 44 47 48 50 51
        47 53 56 57 59 61 64 62
        13 19 22 25 28 31 34 34
        56 63 64 66 70
        65 70 71 74 79
        41 46 44 45 46 48
        13 19 16 18 16
        74 80 77 78 78
        41 46 47 46 48 52
        31 37 36 39 44
        42 48 48 51 53
        7 14 15 15 17 15
        60 67 67 69 69
        21 28 28 29 33
        59 65 68 70 73 73 79
        40 45 49 50 53 56 58 59
        83 88 92 95 93
        35 40 42 43 46 48 52 52
        72 79 80 84 85 89
        37 44 47 51 53 54 57 63
        37 42 43 44 51 54
        75 82 83 89 90 92 90
        48 53 60 62 65 68 71 71
        4 11 14 19 23
        72 79 80 85 86 88 89 96
        65 62 61 60 63
        55 54 53 50 49 48 48
        14 11 10 8 4
        24 22 20 19 18 16 15 9
        78 75 77 75 73 70 69 68
        74 73 70 73 72 74
        23 21 18 19 19
        80 77 79 77 76 72
        78 75 76 74 71 68 63
        88 85 83 83 81
        44 42 42 39 38 41
        34 31 31 29 29
        76 73 72 72 69 65
        78 77 74 72 72 67
        76 74 70 69 66
        84 82 79 76 72 70 69 71
        21 18 14 13 11 11
        67 66 62 61 58 55 53 49
        66 64 61 57 54 51 46
        77 74 73 71 69 67 61 60
        28 25 19 17 15 13 12 14
        16 14 8 6 6
        90 88 85 84 78 74
        79 77 72 69 66 65 62 57
        83 86 85 82 80
        31 34 31 30 31
        9 11 8 7 5 5
        65 68 65 63 59
        74 77 75 74 71 70 63
        32 33 30 28 27 29 26
        9 11 9 7 4 7 5 6
        92 95 94 93 90 91 91
        26 28 31 28 25 24 20
        18 19 18 15 17 11
        18 21 21 19 16 15
        10 11 8 7 6 6 4 6
        51 53 53 50 49 49
        72 73 72 71 71 70 67 63
        91 93 90 88 87 87 86 81
        58 60 56 53 51
        12 13 9 8 10
        5 6 2 1 1
        47 49 47 45 44 43 39 35
        52 53 52 51 50 46 41
        88 89 87 80 79
        17 19 18 11 13
        57 58 55 50 47 46 46
        30 31 29 27 25 23 16 12
        56 59 58 56 50 43
        29 29 26 24 23 22 20
        64 64 62 61 60 58 60
        62 62 60 57 57
        63 63 62 60 57 55 52 48
        19 19 18 17 15 14 9
        25 25 28 26 24 21 18 16
        41 41 39 38 37 39 41
        68 68 71 70 69 68 67 67
        68 68 65 68 65 61
        51 51 52 50 44
        92 92 89 89 86
        48 48 46 46 47
        92 92 91 88 88 88
        10 10 10 8 7 3
        50 50 48 47 45 45 43 37
        85 85 84 82 81 80 76 75
        60 60 58 54 51 48 50
        83 83 79 76 76
        62 62 61 57 53
        75 75 72 69 65 59
        96 96 93 92 90 89 83 82
        94 94 91 90 85 84 83 85
        44 44 37 34 31 31
        28 28 26 25 22 21 14 10
        71 71 69 66 61 55
        82 78 75 73 70
        60 56 54 52 51 50 51
        69 65 62 60 58 55 52 52
        23 19 16 14 11 10 6
        81 77 75 73 71 66
        10 6 8 7 5
        65 61 59 60 63
        76 72 70 68 69 68 65 65
        57 53 50 52 48
        87 83 82 79 81 78 73
        39 35 33 32 32 29 27 24
        98 94 93 92 92 89 87 90
        63 59 58 58 58
        30 26 26 23 19
        42 38 37 36 34 34 33 27
        44 40 39 35 34
        16 12 8 7 4 1 2
        93 89 85 82 81 80 77 77
        43 39 37 33 31 27
        52 48 44 42 35
        21 17 16 10 7 4 2 1
        71 67 62 61 58 57 54 57
        21 17 15 10 8 8
        54 50 47 44 39 35
        62 58 53 51 44
        66 59 56 53 52
        41 35 32 31 30 29 31
        44 37 35 34 32 31 30 30
        30 24 21 20 17 13
        35 30 27 26 20
        33 27 25 27 25
        55 48 45 42 45 47
        8 3 1 4 1 1
        82 77 74 75 71
        93 86 85 87 86 85 83 78
        80 74 72 71 71 69 68 65
        51 44 43 43 44
        73 68 65 64 62 62 59 59
        77 70 69 68 65 65 64 60
        91 85 82 82 79 72
        37 30 27 23 22 19 17
        91 85 83 80 76 75 74 76
        58 51 47 44 44
        45 39 37 35 31 28 24
        42 35 32 29 25 18
        67 61 59 54 53 52
        23 17 16 9 6 8
        39 34 29 26 24 23 21 21
        24 17 15 14 9 5
        97 92 90 87 81 79 78 71
        52 52 52 54 55 57 59 64
        83 87 88 89 93 93
        79 85 88 87 84
        41 41 43 43 41
        77 75 74 73 74 74
        12 19 19 22 24 24
        33 33 40 42 46
        92 86 82 80 74
        17 18 16 13 12 10 7 2
        63 68 71 72 70 71 72 72
        78 83 90 93 93
        27 28 28 29 31 33 35 38
        48 47 50 51 55
        53 53 51 48 45
        25 21 18 15 14 11 11 7
        28 33 36 38 41 39 43
        40 46 53 56 61
        70 69 70 75 73
        38 42 43 45 47 48 53
        35 38 37 34 33 30 28
        73 72 77 80 81
        92 88 85 82 82 81 78 76
        44 48 50 51 52 52 55 52
        59 64 64 67 71
        29 34 36 42 44 47 46
        53 52 53 60 63 70
        51 53 56 58 58 58
        83 80 76 74 71 65
        58 62 63 65 67 70
        87 87 84 77 77
        25 29 32 32 39
        68 70 73 75 75 78 79 78
        53 48 44 41 39 35
        73 72 75 72 79
        62 63 65 68 71 74 79
        35 39 46 48 50 52 53 57
        48 46 49 51 52 52 50
        50 50 51 53 56 56 56
        96 93 91 90 84
        27 23 20 13 11 6
        77 82 83 81 84
        91 91 87 84 86
        77 77 79 79 83
        18 18 19 23 24 28
        65 65 63 62 60 53
        85 87 88 87 86 85 84 80
        35 31 29 25 22 15
        6 7 4 1 2
        77 82 85 88 89 92 93 97
        35 36 35 34 31 24 18
        48 50 53 56 62 64
        75 71 70 73 72 71 68 66
        56 55 58 59 62 63 67 71
        22 22 26 27 29 31 32 32
        70 74 75 73 75 76 77 77
        29 30 32 35 33 36 37 43
        71 67 64 64 59
        95 97 96 95 95 93 91 87
        88 91 93 94 91 90
        92 88 87 83 81 80 76
        4 7 9 10 11 13 10
        19 18 21 25 27 30 30
        32 31 28 23 22 20 13
        31 35 38 41 45 48 49
        72 71 72 71 65
        72 72 70 65 67
        33 30 28 24 27
        73 70 67 64 63 61 61
        58 58 59 58 56 58
        71 77 78 81 83 86 86
        64 66 63 63 61
        47 51 51 53 54 55 55
        46 42 39 36 35 33 35 31
        84 86 85 79 79
        66 63 61 59 55 51
        67 69 72 74 75 81 88
        44 47 48 51 52 56 57 61
        94 94 96 94 89
        46 46 46 43 37
        73 72 74 77 79 82 84 89
        61 56 50 49 48 47 47
        31 27 25 24 22 23 22 22
        48 43 41 39 32
        40 33 30 28 25 25 21
        44 50 54 57 58 61 67
        49 51 45 44 41 44
        26 26 22 19 16 14 13
        46 52 52 54 56 53
        59 61 58 56 56 53 51 45
        27 28 33 36 39 43
        73 71 72 74 76 81 84 88
        48 43 42 40 40 38
        17 23 25 25 27 32
        96 91 88 90 88 84
        20 25 26 31 34
        19 16 16 18 21 23 26 32
        65 69 72 74 75 79
        57 53 53 51 48 49
        29 29 28 28 27 26 24 25
        91 92 89 86 82 76
        22 21 22 24 25 26 27
        91 92 94 96 97 97
        43 47 50 55 61
        22 15 13 10 6 4 5
        37 36 33 30 28 24 21
        19 19 16 14 11 11 7
        45 45 48 49 50 48 48
        28 28 27 25 25
        60 62 60 59 56 52 49 49
        14 14 17 15 16 17 22
        14 17 14 11 10 6
        9 9 11 10 14
        27 23 21 18 15 15
        54 56 63 65 67 70 70
        15 15 17 18 20 23 27
        37 36 37 41 44 45
        55 62 64 66 69 70 72 73
        72 67 65 58 56 50
        5 11 13 16 20 19
        66 73 75 75 76 79 80 82
        18 21 25 27 28
        55 55 59 62 63 62
        48 48 42 41 39 32
        67 69 66 64 63 56 54
        42 42 43 46 45 44
        43 47 49 53 54 55 57 63
        14 13 7 5 1
        59 56 57 55 56 56
        97 97 98 99 97
        33 33 31 28 26 23 19
        25 25 27 29 30
        85 81 84 82 84
        81 80 81 84 87 89 91 90
        77 78 79 82 82 84 87 91
        34 30 29 27 25 22 24
        24 24 25 26 27 30 37
        77 81 85 87 84
        28 25 26 28 26 24
        96 90 86 85 83 82 80
        9 8 5 5 5
        55 52 53 53 54 54
        73 72 73 74 81 81
        96 93 95 93 89
        48 47 46 43 37 37
        53 57 59 60 62 60 62 61
        68 70 68 66 62 61 59 61
        82 81 81 83 87
        17 17 14 10 9 2
        73 78 80 84 86
        20 13 14 11 11
        75 79 80 77 80 84
        94 91 92 95 97 97
        89 89 88 85 84 85 82 82
        79 78 80 77 79 83
        7 8 9 13 14 17 16
        70 73 74 71 69 68
        69 63 60 59 56 58 55 57
        35 31 30 23 20 17 13
        45 40 36 35 35
        32 28 26 21 19 17 17
        56 53 50 44 43 46
        60 59 58 56 52
        74 74 80 82 83 86
        84 84 87 90 93 95 95
        25 30 33 35 36 39 41 48
        12 10 13 13 14 16 19
        72 66 64 62 59 55
        90 91 89 91 92 93 97
        71 70 70 68 64
        36 32 25 24 27
        36 36 34 30 29 26 22
        26 19 18 17 14 11
        28 21 19 17 17
        20 20 18 16 14 13 16
        81 78 79 81 85 91
        38 34 31 28 27 26 25 20
        71 71 64 61 59 57
        20 20 22 20 19
        57 55 52 55 53 52
        71 72 70 71 73 76 78 78
        1 3 6 8 9 13 13
        19 18 16 12 12
        48 50 53 53 58
        90 91 88 84 83 82 80 78
        45 49 51 52 53 55 54
        15 13 10 10 9 7
        29 33 34 36 37 38 39 39
        15 21 24 25 26 30 30
        49 48 46 44 41 40 38 36
        82 85 88 91 93 95 96 97
        70 73 75 78 81 84 87 88
        71 72 73 75 78 80
        65 62 61 60 58 57 54 53
        89 91 94 95 98
        83 85 86 87 89 90
        13 11 10 9 6
        69 70 71 73 76
        86 87 90 91 93 94
        81 78 75 72 70
        75 78 79 82 84
        88 85 84 81 79 76
        65 62 60 59 56 55 52 51
        90 88 87 85 82
        36 35 33 30 28 25 23
        70 69 66 63 62
        4 5 7 8 11
        44 43 42 41 39
        6 7 8 11 14 16
        27 28 30 31 32 33
        84 82 81 80 78 77 74
        74 71 70 67 65 62 59 58
        53 56 59 61 63 65
        85 86 87 89 92 93 95 96
        49 50 53 56 58 59 61 63
        72 69 66 65 63
        57 55 54 51 50 48
        55 57 58 61 63 64 66 68
        19 21 24 26 27
        60 59 58 55 53 50 48 47
        77 76 74 71 70 68 66 63
        3 4 7 10 11 14 15 17
        58 57 54 52 49
        77 75 74 72 70
        80 77 74 72 70 68 67
        33 30 27 24 21 20 17
        44 45 46 48 50 52 54 57
        72 73 76 78 81 82 85
        88 91 92 93 94 97 98 99
        23 20 19 18 15 12 11
        39 40 43 44 45 48
        84 87 88 91 94 95
        38 35 32 30 27 26 23 22
        34 35 36 38 41 42 43
        61 63 66 68 69
        51 54 56 57 59 60
        63 66 67 70 71 74 77
        17 16 13 12 9 8
        63 61 59 57 55 52 50
        61 64 65 67 70 72 74 76
        74 72 69 68 65 64
        12 15 16 18 20
        97 95 94 91 88
        67 68 69 70 73 76 78
        51 54 57 58 61 63 65
        45 44 41 38 36 35 32
        70 73 76 78 79 81 82
        18 15 14 13 11 9 6
        44 41 40 39 36 35
        33 34 37 38 40
        30 29 26 24 21 19
        29 30 31 32 33 36 38
        48 46 45 43 41 40
        83 84 87 88 90
        48 49 51 52 53 54 57
        68 71 73 74 76 78 81 83
        79 81 84 86 87 90
        63 64 67 68 71 73
        47 49 50 51 52 53 54 56
        95 93 90 89 88 85 83 81
        46 44 42 41 40 38 35 34
        87 86 84 81 78 75 73
        84 87 90 91 92 94
        87 86 83 81 80
        11 9 6 5 3 2
        10 8 5 4 3
        49 46 44 43 40 38
        34 37 38 39 41 43 44 46
        47 50 52 54 57
        87 86 84 81 78 75
        81 84 85 87 88 91 92 94
        32 35 38 39 42 45 48 50
        74 73 71 70 69 68
        41 40 37 36 34 32 29 27
        13 15 16 19 21 23
        17 16 14 12 10 7 4
        66 69 72 73 74 75 77
        13 11 8 7 6 3 1
        13 16 17 20 21 23
        32 30 28 25 23 21
        75 73 70 67 64
        22 23 26 27 30
        67 70 72 74 75 76 79
        52 51 50 49 46 44 41 38
        64 62 59 57 55 54 52
        34 37 38 39 40 42 45
        14 11 10 7 5
        1 4 6 9 11
        75 72 70 69 67 65 64
        22 19 16 15 14
        86 85 84 83 82 79 77
        88 85 84 81 78 77 76 73
        15 14 12 10 8 7 4
        53 54 57 60 63 64 66
        72 70 67 66 63 61
        21 24 27 29 30 32 34
        21 19 18 17 15 14
        16 13 11 9 6
        49 52 53 56 58 61 64 67
        57 56 54 51 48 46 43 41
        90 91 94 95 96 97 98
        59 62 64 65 67
        33 30 27 24 21 18
        25 23 22 20 19 17
        3 4 5 7 9 11
        57 54 52 50 47 44 43 41
        86 88 91 93 94
        54 55 58 59 62 63
        91 94 95 96 99
        86 89 92 94 96
        69 70 73 74 76 77
        3 6 7 8 10 13
        65 63 60 57 56 55 53
        13 15 18 20 22
        14 13 11 10 7 6 3
        5 6 9 11 14 15
        59 62 63 65 66
        62 65 67 69 70 71 74 75
        70 69 67 64 61 59
        70 68 66 64 61 58 55 52
        3 6 7 8 9
        11 13 15 16 18 20 23
        95 93 91 89 86 83 81 79
        25 23 22 21 18 17
        63 64 67 70 71 73
        94 93 90 88 86 83
        86 84 83 80 78
        17 16 13 11 8 5 2 1
        78 79 82 84 86 88 91
        69 68 67 65 63
        77 78 79 81 83 85 87 90
        77 75 72 71 69 66
        76 77 80 81 83 85
        82 81 79 76 74 72
        63 61 58 56 53 52
        65 66 69 71 74 77 78
        37 40 41 44 47
        90 89 87 84 82
        69 72 73 76 78 81
        10 11 13 14 16 19 22
        52 51 48 47 44
        75 76 79 81 84
        82 80 77 76 75 74
        78 77 75 74 72 70 68
        12 13 15 16 17 20 22 25
        12 9 7 5 3 2
        44 42 40 37 36
        65 67 69 70 73 75 78
        92 91 89 86 83 82
        98 96 93 92 90 88
        77 74 72 71 70 69 68
        74 73 71 69 68
        85 88 91 93 95
        12 10 9 6 5 3 1
        88 87 84 82 81 80
        5 6 9 10 11 14
        20 19 17 16 14 12
        50 47 45 43 40 39
        57 54 52 49 48 46
        79 80 81 82 85
        93 90 89 88 86
        6 9 10 11 12 14 17 19
        4 7 9 10 12
        45 44 42 40 39
        1 3 6 7 9 10 13
        37 36 33 31 28 26 25 22
        25 24 23 21 19
        78 81 84 86 89
        23 21 19 16 13 10 9 7
        82 81 78 75 74 72 71 69
        94 93 90 87 84 81
        90 89 87 84 82 81 78 76
        86 83 82 80 79 76 75 72
        65 62 59 57 55 53
        41 44 47 50 53
        99 96 93 91 88 85 83 81
        94 91 90 87 85 82 81 79
        50 47 45 44 42 40 39
        79 82 84 85 86 89 91
        28 26 24 21 20 19
        22 23 25 26 27 29 30
        42 45 48 49 50 51
        90 88 87 86 84 83
        14 15 16 18 21 24
        91 89 88 87 84 83
        7 10 11 14 15 16 17
        60 58 56 55 52 51 48 47
        88 91 93 94 96
        91 88 85 83 81 78 76 74
        54 51 50 48 45 42 41 40
        84 86 89 90 92 94 96
        16 13 12 10 7
        47 49 51 53 54 55
        43 45 47 49 50 53
        97 94 92 89 86 83 81
        85 88 89 90 92 93 94
        51 53 55 58 60 61 63 65
        61 63 64 66 69 71 73
        60 58 57 56 54
        56 54 53 52 50
        89 87 84 81 78 76 73 70
        15 16 17 20 21
        34 36 37 38 41 44
        41 40 39 36 33 32 30 27
        91 92 94 96 97 98 99
        12 14 17 20 21
        40 43 44 47 50 52 54 55
        49 52 53 54 56 59 61
        91 89 86 84 82 79 78 75
        43 45 47 50 51 54 57
        51 48 45 42 41
        34 33 32 30 29
        55 57 58 60 61 64
        62 59 58 55 54
        61 63 66 69 72 74
        55 53 52 49 48 47
        20 22 25 27 30 32 34 35
        71 73 76 78 79 81
        35 36 38 39 41 44 47 48
        60 63 66 69 71 73 76 79
        90 89 86 84 82 80
        71 73 76 77 80 82 84 87
        81 82 83 86 87 89
        42 40 38 37 34
        97 96 93 91 89 86
        11 12 15 16 18
        1 2 5 8 10 12
        8 7 6 3 2 1
        71 70 67 65 64
        91 89 88 85 82 79
        69 67 65 63 61 60 58
        53 52 50 49 46 44 42 41
        21 19 18 17 14 13 11
        93 92 91 90 87 84
        34 31 29 27 26 24 23 20
        86 84 82 81 78 77
        71 73 74 75 76 79 81 82
        28 31 32 33 34 36 39
        53 56 58 60 62 65 68 69
        50 51 54 55 58
        59 61 64 65 66
        81 83 86 87 89
        65 64 62 61 60
        75 74 72 71 68 67 64 63
        29 31 34 37 39 41 43 46
        51 48 46 43 42 39 36
        34 35 38 39 42 45 48
        34 32 31 29 27 24 22 20
        28 27 26 24 21 20 17 15
        27 30 31 33 35 37 39
        47 44 41 39 36 35
        60 62 63 65 67 68 70 71
        28 31 32 34 37
        38 41 42 43 45
        65 64 61 60 59
        78 81 84 86 87 90 91 93
        45 42 41 38 37 36
        72 75 76 79 81 82 84 86
        81 78 77 74 73 72 69 66
        70 71 74 76 77 80 82 83
        17 15 12 9 8 7 6
        42 44 45 48 51 53 55
        60 58 57 55 54
        36 33 32 31 29
        49 50 53 54 56 58 60
        71 72 75 76 78 80 82 85
        38 35 32 29 26
        30 33 36 37 40
        65 62 61 58 56 54 52
        28 31 33 36 38 41 43 45
        85 83 81 80 79 77 74 71
        72 69 68 66 64 61
        48 50 52 53 54 56 58
        78 80 81 83 86 88
        57 55 52 50 49 46 45 42
        85 88 90 91 93 94
        91 89 87 86 83 82 80 77
        77 78 81 84 87 88 90 93
        67 68 69 71 74 77 78
        65 64 61 59 58 57
        24 26 29 32 35 38
        64 67 68 69 72 74 76
        82 80 77 75 73 70
        12 15 16 19 21 23 26 28
        90 88 85 84 81 80 78 75
        18 20 22 23 25 28
        79 78 77 75 73
        69 68 67 64 61
        58 60 62 64 66
        35 36 38 41 44 45
        81 84 86 87 90 91 93 96
        78 75 72 70 67 64 61 60
        5 6 9 11 13 15 17
        51 53 54 55 57 60 61
        41 38 36 34 31 29 28
        47 50 52 53 56 59 60
        27 25 22 20 18 16 13 10
        46 48 50 51 52
        93 92 90 89 88
        63 62 60 57 54 53 50 48
        82 84 86 87 90 91
        26 29 30 31 34 35 38 40
        79 77 76 74 72 70
        25 27 28 30 31
        84 85 86 88 90 92
        26 29 30 31 33 36 38
        59 62 65 66 69 70 71
        4 5 7 9 12
        10 12 14 15 16 19 22
        44 47 50 53 56 59 62 63
        85 87 89 90 91 93
        31 34 37 39 42 45 46
        32 33 34 35 36 37 39 40
        78 77 76 74 72
        37 40 42 44 47 49 52
        11 9 8 6 4 3 2
        24 22 19 18 16 13
        36 34 32 29 28 25 23 21
        87 84 81 79 76 75 73
        83 85 87 88 91 94 97 99
        36 33 32 30 29 27 24
        86 85 83 82 79 77 74
        59 56 54 52 49 48 47
        78 79 82 83 85 87 88
        36 39 42 45 47 50
        87 89 90 93 94 96 99
        93 94 95 97 98
        20 17 15 14 11 9 6 3
        73 70 67 66 64
        84 85 87 90 92 94 97
        49 46 45 43 40
        4 7 8 9 12
        28 26 24 21 18 16
        15 16 19 20 23
        14 15 16 17 20 22
        45 46 49 50 53 54 56 58
        58 57 55 54 51 49
        52 55 58 61 62 65 67 70
        28 30 31 34 35 38
        40 38 35 32 30 29 26 24
        91 88 85 84 82 79 77
        35 34 32 29 27 26 25
        60 57 55 52 51
        85 88 90 91 94 97
        13 16 18 19 22 24 25
        41 42 43 44 45 48 49
        32 34 36 38 41 42
        13 14 17 20 22 25
        51 48 46 44 43
        60 63 65 66 68 71 72 74
        17 20 22 25 27 30
        75 77 80 82 85 87
        73 74 77 80 82 85
        78 77 74 72 69 67
        21 19 17 15 13 11
        43 46 47 50 52
        79 80 82 85 86
        74 76 78 80 82 84 87 90
        92 90 88 86 84 82 79
        12 10 9 7 6 3
        11 9 8 7 6
        29 28 27 24 22 20
        75 76 78 80 82
        66 64 62 60 57 56 55
        58 56 54 53 52 50 47 45
        13 14 17 19 21 24 25 26
        14 17 19 22 25 27 30 32
        90 89 86 84 83 81 80
        52 49 46 45 42 41
        39 40 41 43 46
        53 56 58 61 62
        83 81 79 77 75 72 70
        59 60 62 65 66
        34 35 36 39 40 41 43 45
        80 81 82 83 86 89 90 92
        17 16 14 11 10 8 5
        20 18 16 14 12 11 8 5
        54 51 50 47 45 42 40 39
        96 93 92 90 89 87 85
        85 87 90 91 93 95 96 99
        49 50 53 55 57
        16 19 21 24 25
        64 65 68 69 71 73
        23 26 29 32 34 37 38 41
        79 82 85 87 90
        88 89 92 94 95 98
        22 20 19 17 14 11
        74 72 71 69 66 64 61
        29 26 25 24 22 19
        56 54 53 52 49 48 45
        28 31 34 36 37 38 40
        23 22 21 18 16 15 12
        43 44 47 50 52 53 55 58
        92 91 88 85 82 80
        41 43 44 47 48 51 53
        18 16 13 11 9 7 6 4
        84 85 88 90 91 92 93 96
        57 58 61 62 64 67 70 73
        57 58 59 62 63
        26 24 23 21 18 17
        95 93 92 91 88 85 82
        63 65 67 68 71 72 75
        85 86 89 92 95 97 99
        29 27 26 25 22 21 18
        40 42 45 46 47 49
        43 45 47 49 50 53 55
        94 92 89 88 86 83 82 80
        28 27 26 23 21
        85 88 90 92 94 96 97
        58 56 54 52 49 46 45 42
        64 67 69 72 74 75 76 78
        8 10 11 13 16 19 20
        97 96 94 92 90
        59 61 62 64 66 69 71
        74 73 70 68 66
        20 23 25 27 28 30 32
        34 31 30 29 27 25 22 19
        44 42 40 39 38 36 34
        93 90 88 85 82 79 76 73
        69 68 66 64 63 60 58 56
        13 12 10 8 7 6 5 3
        68 71 74 75 76
        40 39 36 34 31 28 27 25
        48 45 44 42 39 38 37
        68 70 72 75 78 80 83
        84 87 88 91 93 96 99
        45 44 41 39 37 35
        16 14 11 9 8 6 3 2
        77 80 81 83 86 87
        18 21 23 26 27 28 30 31
        12 15 16 19 21 24
        27 29 31 32 33 35
        77 76 74 73 70 67 64 63
        28 30 33 35 36 37 38
        49 48 46 43 40 37 34 32
        75 77 80 82 83 85 88 91
        20 17 14 13 12 10 9 6
        63 60 57 55 54
        18 21 24 25 26
        63 65 68 70 73
        88 87 85 84 83 80
        61 64 67 68 70
        21 22 24 27 29 32 34
        52 51 49 48 46 43
        82 81 78 76 74 73 71
        24 21 20 19 17
        66 63 62 61 58 57 54 51
        69 66 64 62 61 59 57 56
        14 17 19 20 21 24
        3 4 5 8 9 11 13 15
        81 79 78 75 74 73
        30 31 33 34 36 37 40
        66 63 62 60 58 56 55 52
        15 16 18 20 21
        77 79 81 82 83 84 87
        7 8 9 11 12 15 17
        19 16 14 12 10 8 7 6
        42 45 47 49 52
        42 39 36 33 30 28 26
        32 30 28 25 22 21 20
        73 70 69 67 65 64
        10 12 13 14 15 18
        72 69 66 64 63
        75 76 79 81 82 85 87
        63 66 69 71 74
        17 14 13 10 8 7 5 2
        52 55 57 58 60 62
        41 42 45 48 50 51
        61 60 58 56 55 54 51
        56 57 59 60 63 64 66
        79 78 77 76 75 73 70 68
        93 91 89 87 85 84
        39 38 37 36 33 31 29 28
        32 35 38 39 42 44 45
        12 15 18 19 22 25
        88 90 91 92 95 96 98
        45 43 41 38 35 33
        22 20 17 16 14
        52 50 49 47 45 42
        98 95 94 93 91
        6 7 9 10 11 12 15 18
        55 58 61 62 64 66 68
        67 69 72 75 76 78
        96 93 90 87 84
        58 60 63 66 69
        51 52 53 56 57 58 59
        24 26 29 32 35 36
        35 32 29 27 25 22 19 16
        34 33 31 28 27 26
        45 44 41 38 37 34
        32 31 30 29 27 24 23
        59 60 63 65 66 69
        61 59 58 55 53 51 48
        80 81 84 87 90 92
        67 64 63 61 58 56
        58 61 64 65 67 68 69
        52 55 56 58 59 60
        76 75 72 69 67 64 62
        78 81 82 83 85 88
        48 46 44 42 41 39 36 33
        65 64 63 60 59 57 54 51
        56 58 59 60 61 63
        64 66 69 72 74 77 79 81
        36 34 32 30 28 26 23
        82 80 79 77 76 74 72
        22 24 27 28 31
        67 66 63 61 59 58 55
        55 57 59 62 63 64
        4 5 7 9 10 12 14
        57 58 59 62 64 65 67 68
        21 19 16 14 11 10 8 5
        33 31 29 26 24 22 19
        66 63 60 59 57
        54 51 50 47 46 44 43
        97 94 93 92 89 86
        16 19 22 23 25 27
        46 44 43 41 40 39
        74 72 70 68 66 65 63 60
        55 54 51 50 48 45
        17 18 21 22 23 26 28 30
        61 62 65 66 67
        77 75 73 70 67 64 61 60
        48 50 53 56 59 61 64 65
        75 78 79 81 83 86
        52 54 56 59 61 63 66 68
        45 42 40 39 36 35 32 31
        77 75 73 71 70
        60 57 55 52 51 50 48 47
        70 73 75 77 79 82 84 85
        75 77 79 81 84 86 88
        49 52 53 55 57 60
        80 81 83 84 85 87 90 93
        16 17 19 21 22 24
        61 58 55 53 51 48 47 46
        70 68 65 63 61 58 55 54
        3 6 8 10 11
        89 87 86 84 82 81 79
        27 29 32 33 36 38 41 43
        47 49 50 51 52 55 56
        28 29 31 32 35 38
        90 89 88 87 85 84
        38 37 34 33 32 29 26 23
        67 66 65 62 59
        66 63 61 60 59 58 57
        21 20 19 17 15 12 9 8
        18 21 23 24 27
        8 10 13 15 16
        29 28 25 23 20
        63 61 58 57 55 54
        53 54 55 58 60 63 64
        13 12 10 7 6 4
        35 33 32 30 27 24 21 18
        69 67 64 63 61 60 58 55
    """.trimIndent()