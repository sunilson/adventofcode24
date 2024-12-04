package day4

val INPUT_DAY_4 = """
    SMMMSMSMSSSMSSSXAMXXAASXMMSMXMAMSSSXSAMSAMXSXSSSMXMAXASXSASXSXMXSMSMSXSMMMMAMMXXSMMMSXSXXAMXMAMASMSMSSMMMMSAMXXMXMASMMMAMXSSMXAMXMASMSMSMSAA
    XAAAAXAAMAAAAAMMXXMASASAMAAXMXSMAAMASXMSXSXMAXAAXSMSXXMASAMSXAMAMAMASXSXSASAMSAMXAAXSSMXASXSXXMMSAXAAAAAMAMXXAXMASMSAMXAMXMASXSAXSASXAAAAMMM
    SSMSSSMSMSMMMSXASMAXMASXMXSSMAMMMMMAMAAMMMAMMMMMMSAAXMMMMMMAMAMAMAMXMAMASAMASAMXSSMMMASMMMAXAXSAMXMMMXAMSSMSMAXXMAXMASMSSMMAMMMAMMASMMMMXMAM
    XMAMXAAXAAAMXXASAXSXMXMASAAXMASXXXMXXMMXASAMAAXXAMMMMMAMAMXMSXMASASAMXMAMAMMMMMMXMSMSAMSAMXMMMSAMMAMXXSMMAASMMMMXMAXAMXXAMSASAMAMMAMAXAXASMS
    XMAMSMMMSMSMAMMXMAMXSAXAMMSMMASMMMMSXAMSXSASMSSMMMMAAXAXASAXAXMMSMSASMMASAXAAAAAAMAXMAMMMXAAAXMAXSAMXXXAMMMMAAXXAXXMMMXMAMXAXMXASMMSXSXSASAA
    XXAXMMMAXXXMXSAMXMMASXSXMAMAMAXAXAAXMAMSAMXMAMXXAASMSSSSXSMSMMSMSAMAMASXSASXSMSSMSAMMXMAMSSMMMSAMASXSXSAMXASMMSMSSMXSAMXSMSMMSSMMAAXXAMXMMMM
    MSMSAAMSSMXSXMMSAAMXSXSXMASMMXSXSMASMSMMAMMMMMXMXMXAXXXAXMXSMAAAMASAMXMAMAXAAAMAMXXSAASXMAMAMXMASAMXMMMXSSMXXMAMAAAAMAMMMAAXAXAASMMSXMAXXAMX
    AAAXXMMXAAASASASXSXAXAXXSASAMMSXAMAXXAMSMMMAASXSASMSMSMSMSAMMSMSMXAASAMXMMMSMMMMXAMMMMMAMASXMASXMMMXSAXAXAMXSXMASMMMSSMAMSMMSSSMMXMXMASMMMSS
    MMSMMSASMMMXAMAXAXMAMXAXMXXAMAMSXMXSSXMAMAXMMXASAMAXASAAAMMSAAAXXSAMXAAXSMAXASXSAAXAXMXSMASASASXMAXMASMMSSMAAAXMAXXAAAMSXXMXMAMSMASMMXAMAMAM
    MAMAAMMAXAXMSMMMSMASXASXMXSSMAXXMASMAMSAXMSMAMMMSMAMAMMMMMXMMSMMMXMXSAMXSMMSAMAMSMMMXMAXMXSMSXMAMMXMAMXXAAMXSXSXMSMMSSMMMXMAMAMASASAMXMSMMMS
    MAXMMSXMAMMAMAMAAAMAMMXAXAAXMXMAMSMXMASAXSAMMSAAXMAMXMXMMSAMMXAXXAMXMASAMAAMAMMMAXXXAMXSAMXAXMASXSMSASMMSMMXMMMAMAAXAAAXMASASMSXMXSXMXAAXAXA
    SMMSAAMXSAMSSMMSSSMMSMAXMAMSSMSSMMXSXMMAMSASXSMMXXMASXSSMSASASMMMASASASASMMSMMASMSSSXSMAMSMSMSAMXXASAXAMAAMASASMMSSMMSMMMAXAMXXMMMMMMMSXSMSM
    AMAAAMAAMAXAAAAAAAXXAMSSSXXAAAAXXXSAMXMXMMAMXXSAMXXXXAMMMSXMMXXAXXMASXSAMXAAMSAXXAMMMMMMSAMAAXMMMMMMSMXMXSMASMMAXMAMMAAMMMSAMSSMMSAAXAXAXAAM
    MMAMSAMXSXMSSMMMSMMSMXXAMXASMMMSAMXMAXMMSXMASAMXXMXMMMMAAMASASMSAMMAMAMAMMSSMMMSMMAASMMXSAXMMMAAXMAAMMXSAMMAMASMMXMSSMXSAAAAXAAAASMSSXSASXSM
    MAMXMAXMAMAXXXAAAXXSXSMMMSAMAXSMXXASMXMAMAMXMXMMASAXMAXMMSAMMAAMAXSXSXSAMXXMXMSAXSSXSAMXSAMSMMSAMSMSSXAMASMXMXMXMAMXXSAMMSMMMSMMMSSXAAMAMAAX
    MAMASXMXMXSXAXMSXSMMXSAXAMAMAMSAMSASMAMMSMMMSASXMSMSMAASAMMSXMMSAMSAAASXMXMXAXMAXXAXMAMMMXMAAMAMXXAMXMASAMMMSAMAMSSMAMXSXMAXAAMAMXAMMMMAMSMM
    XASXSXXAMXMAXSAMXSAMMSAMXMXMMSMAMMXMMAMXAAAAMMSAAMAAXMXXAXAMAXMAXAMXMXMMXXASMSMSMMMXXSMAXSSMSMSSXMAMAMAMAMAMXASXMMAMXMASASMMXXSASAMXMASXMMAM
    SASAMMSXSASAXXAMASAMAMASMSMSMAMSXMXAMXSSSXMSSMSMMMSMSMMSAMMXMMXMMSMMXSMMAAMAXXMAAAXAXMASAMXXXAAAASASMSASMMSMSXMXXMAMXSAMAMXSXMSXSXMAXXSMMSAM
    AXMMAMXASMXMXSAMXMAMSSSMAAAASMMXASXMSMMMXAXXAAXXAAMASAAMXXMASMMXMAAMAXAMMXMASMMSSMSAXSAMMMMSMMMXMMAAAMASXAXAMMMSSMAMAXXMXMXSAAXMSMSMSAXAXSAM
    MXMSSXMXMAMSAMASASMMMXAMSMSMSXMXAMMAAXMASMMSMMMSMXSASMSSMXMASAAAXSAMMSXMXMXAAAAXAXMAXMASXAASAMAASMMMMMSMMMMXMXAAAMAMMSMSSMASMMMMXAAAMMMSMSAM
    XAMAMXXMMMMMASAMXXXAXXMMXXXXMASMMMMSMSAAXXXSMMASXAMMMXMAMMMMMXSMMXAAMMXMAXMASMMSMMMSAMXMAMMSAMASXASAMXMXAXMXSMMSXMAMXAAAAMAMMAAMMMMSMXAAASXM
    MXMASAMSAMAMAMASMMSSMMSAMXMASAMXMAXMAXMASMAXXMASXMSSMSSSMAAMMAMXXMMMAMAXAXMAXMXAXSAXMXXXXSXMXMMXXXMAMAMMMSMAMAMXMSASXMSSSMASMSSSXSAMXXSMXMMM
    XAXMMXMXASMMMMAMAAAAAAAASXXAMMSASMSMMMMXAMXMMMMXMAXAXAAXXSSSMSMMXXSSMSSSSMMAMMSASXMMMSSMASAMSSMAMMMAMASAXAMMSSMAXMMMXAXMAMXSMAAMAMMSSMXMXAAM
    SXSMSSMSMMMASMXSMSMSMMMSMXMXMASASAXXXAXSXMASAAXAAMSMMMSMAMXMMMAMXXAAXMMAAXMAMAMMMAXAAAAMAMAMAAMASXSMSASMSMSAAAMMSSXSMSMMXSAMMMMMXMAAXMAMSSMS
    XXAAAAXAMXSASAAMXXXMASXMASXSAMXAMMMXSXMXAXAXSMSASAAMXMMAMXAMASAMXMXAMXMSMMSSSXSASMSMMSSMAMSMSSMASXAMMASAAASMSMSMAAMSAMXSAXMASXAMMMMSXSAMMAAA
    SMMMMSXMMMMASMMSASXSAMXMXMAXMMMXMXMAMSSXMMMXAMXAMXSMSSSSSSSMASXMASXXXAXXXXXAAASASASXMAMXMSMAMXMAXXMMMAMXMMMAAXAMMSMMAMAMASAMXSMMAMXAASAMSMMM
    XAAAXMMSAMMMMXSMASAMXXASAMXMSAAAMAMASASAAAXMSMMXMAMMXAXAAAXMAXAXAXXMSMSMXMMMMMMXMMMMMMSXXAMAMXMASMXSMSSXMAMMMSMXMAASMMSXXMASAAMSSSMMMSAMXAMX
    SSMSXSASASXAMXXMMXAXMMXXXMAAXMSASXSMSASMMXSAXAXXMASMMXMMMMMMMSSMMSMAAASMMXAAAXAMXSASXSAMXAMSMXMAXAAXXMAMMASAXAXSSSMMMAXAAXMMMMMMAAXSXMMSMASA
    XAAXXMAXAMMMSSXASMSMMMSMMSSSSXMAMAAAMXMXASMMSMMMMASAMMMXMMMMAAAAXAAXXSXAAXSXMXXAMSASXMASXMMXXMMSSMMMSMAMSAMXXMXMAMSXMASXSMSXSASMMMMSAMAXMAMM
    XMMMMMXMMMMXAMXSMAXXMAAAMXMAAXSAMXMSXSXXMXAXAMAAXXXXMASAMASMMSSSMMSMSMMMMXMAMSMSAMMMXMXMAMAMAMAMXMMXAAAMMXSMAXAMMMSXMAXXAAXASMSAXMAMXMMSMMSS
    SAXAASMXXAXMAXMMMSMXMMSSMAMXMAMXMXAXAMMXXSAMXSSSSMSMSSXXSAXXXMAMAAXXAXAAXAMAMAAASMSSSMSSSMASAMXSXMASMSMSMXSAMMMSMAXASASMMMMXMAMMMMXSXSAAAAAM
    AASMMSAMSMMXSMASMXAMXAAMXSMAXMSXMAXMSMASAAXAXAMXAAAAMAMMMXSAMXAXMMSSMSMSXMSMSMMMXMAAAAAAASASASXMXMMXAXMAMMMMXAASMXSAMXMAAXAMMXXXXSXAAMSSMMSS
    MMMMAMAMAAXAMXMXAXAAXMMSAMMMSMAASMMMAAMSMSASMAXXXMMSMAMAAAXMMAMXXMAMXMXMAMXMAXMASXMXMMMXMMMSMMMMAMMXSXSASMMAMXSMAXMMMSSSMMSXMASXAMMMMMAMXAAA
    XXAMXSAXSXMASMXMMMMMSAMMXSAAAMSMMAMSAMMXAXAMXAXMAAAXXSXMMMMXMAMMSMMXXMAXAMMSASMXSASXSASMMSXMAMASMSAAAAXASMMAXMAMXMSAMMAXAAMASAMMMMAXAMMSMXSM
    MMXXMMAMAXSXMAXAXAAMMAMAXMMSSXMXMAMXXMXXMMSMMSAASMMSXMASXXXXMASMAASAMMXSAMXMASAASMMASASXAXXXAMXMAMMSMSMMMXSAXXAMAAMAMXMSSMSMMMSAMXMMAXAAAMMX
    AAMSMMSMMMXAMXSSSMSSSMMSXMAMXAXMXSSSMSMAXAXXXMMMXAAXAMSMAMSXSASMSMMAMAMSAMXMSMMMSXMXMAMMXMMSMSASMMAAAMAMAMMMMSASMSSMMMXXMASAAXSXSASXSMXMSAMX
    SSMAAAXAXASXMAMAAAAAAAAAMSSMMSMMXMAMAASMMMSMXMXXXMMMSMXMAMXASASXMASAMXMMAMXMAXAXXXXSAAXXXXMAMSASXMSMXSXMASMAAXAMXAAASASXMXMMMMXAMASAXAASAMXM
    XAMSSMSAMXMSMASMMMMSSMMMXAAXAMXSXMAMSMSXAAAAAMAMSMSAXMASASMAMXMASAMSAMXSSMMSASMSSSMASMXMSAMXXMAMXXXAXAXSXSMSSMSMMMXMMSMMSMSMSXMMMMMMMMMMAXXS
    SSMMAMMAMAAXSAXXXMMAMAXMMSXMSSMMXMAMAMXMMXSXMXAXAAMASXASASMAMMSMMMMMXSAMAAAAXXAAAAMAXMXXMXSXXMMMSAMXAMMXXXAAAAAMXSAXMAXMAAAASAMXAXAXAMASMMMS
    MAASXMXAXMXMASXXAMXASMMSAXSXAAAXSXMMAXXMMAXAMSASMSMMMMXSAXMAXAMXAAAXMMASMMMSSMSMSMMASAMSMAMXMASAMXAXMXXAMMMMSMMXAAMMSMSSMSMSMAMSASXSXSXSXSAS
    SSMMMMMMSMSSMMSMAXMMMMAMASAMMSMMMASMSMSAMASAMXAXAAAAAXXMXSXAMSXSSSMXASMMXXAXMAAAAAXAMMAAMAMAAAMASMSXXMSAMXMMMMXMSSSXXMAAMXMAXAMXMXXMAMAMAMSM
    XAAMAAASAMXSAAXMXSSMAXMMMMMSAMASMAMAAASXMMSMMSXMXMSSSSXSAMMXMXAMMAMAXSMMMMSSMSMSXSMSSXXXSSSSSXSMMXMASAXSAMXXAMXAMAMXMMSSMXSSMSSSMMMMAMAMAMAX
    SSMMMAXSASASMMMXAAAXMXSAXAXMASAMMMXXMMMXMAMXAMXMXXXAAMXMAMASAMXMSAMMMMAAAAAAXXMMXXXMMMAXAXXMAXSXMAXXMXMXXXMSMMMSMMMMAMMMMAXAAAAAXXAXAXASMSMS
    MAMSAMXXAMASAMXMMSSMXAXSSMSMMMXMASAMMAXSSMMMMSAMXSMMMMASMMSMSSSMMASXASMSSMXAMXASMMXXXXXMASMASAMASXSXSXMSAMMAMMAMAASMXMAAMMSMMMSMMSSSSSMSAAMA
    SMAMAMAMMMMMAMSXMAXMMSXMMAMXMAXSAMAMSAXXAAAAMSAMAMAXXSXSAMXAAXAASAMXMSAMAMAMXSMSAXMASXXMSMMAMASXMAAAMAXAAMSAMSASXMXAMSSSSXXXAXXXXAASAAXMMMSM
    AXMMXSASAAAMAMXAMSSMAMAMMAMMMMXMXSMMMSXSMMXAMXMMASXMMSMMMMMMMSSMMMSAMMMMAMXAAMASAMMXMMSXAAXXSMMMMMMMMSSSSMMMMSAXXSMAMXAMMMMSXSAMMMMMXMMMXXXX
    AAXXMSASXSMMASMMMMAMAXAMXASAAXXXASAAAMMSAAXSSMSSMSAXAXAMMSSMXXXXAAMMSSSMSMXMASASAMXXXAAXMSMXXMXSAAXXXAAXMXAMMMSMAXSXMMMMAXMAXMAMXXXXAXASAMXM
    MSXSAMAMXMAMXSAMXSXMMSMMSASMSMMMAMXMXSASMMMAAAAMXSAAXSSMAAAASMMSMMSAAXXAAXMMMMXMAMXMMSSMMAMMAMXSMSMSMMSMMXXXAAAMMMMMSAMMSSMXSXMMMSMSXSASMAMA
    AAAMSMAMXXXASMMAXAXMXAAAMMMXXASAMMSMXMAXASXSMMMSAMMMXAXMMMXMMAASXMMMSSMSMMSXAMMMSMSAXAAXMAMMAMXMAXAMXAXAMSMSMSMXMASASMSAXMMMSXMAXAXAAMAMXXAM
    MMSMXSSXMMMXMAAMAMMMSMSMMXMAMAXXSAAAXXSMMAMMXAXMASMSAMXMSSSXMSMSAXXXAXMAMSMSASXMAAXSMSSMSMSSMSXMAMAMMXXAMAASXMAMSASXMAMXXAAAMASMSMMMMMMMSSSM
    XSAXMAXAAAMAMXMSAXAMXAAXXASMMSMMMMXXMAMAMMXXSASMMMXMAXMXAASAAXMSAMSMMSSXSAASMAASMSMMMMAAAAAAAXXMAXAMMMSSMMXMAMXMMMXMMXMMSSMMSAMXAXAAXAXSAAAX
    XSASMAMSSXSASMMSAXSAMXMXSASAAMASASAASASAMXSXMASMAMMSSMSXMXMXSMAXAMXXAAMMSMMMMXXMXAAAXMMMMMMMMMSSSSMSAXAMXSSMMMSXXAMSMSMXAAMMMAMXMMSMSMSMMSMM
    AMAMMXMMAMXXAAXMXMXASMAMMXSMMSXMAMSXMASXMASAMAMXAMAMAAMMSXMAAMMMSMSMSXSAMXMXMSAMSSMMSSXMXSMXSXXAAAXAMMASAXMASASMMMXSAMXMSSMAMASASAMXAMXXAXXX
    XMAMSXSMMMMMSSMMAMXAMMAMXAXXXXAMAMXXMMMMMXXAMMSMSSSMMXMAMAMXMASXXAAXAMMMMXAASAMMAMAAXAAXAXMASMMMMMMSXSMMMASAMASAMXAMXMAAXAMXXMSAMASXMSMMMSMX
    XSASMASXAAXMAMASASMSMSASMMSSSMMMSXMMXMAXXMSSMMSAMAMXXMMSSXMASMMAMSMMMASASMSXSMXMASMXMMSMSXMXSAXMAMAMMMXMXAXASASXMMMXAMMMSAMSSMMMMMMMAAXAXAMM
    XSMSMAMXSSSMSSXSSSXMASXSAMAAAAMAXAMXAMMSSMAMAAMAMMMMMAAAMAXAXAMAMAMXXXSAMAXAMXAMXMMASXAAXASMSAMSSSSMSAAMMMSMMXSXXMMXSXSAMAMAAXAXMXAMSMSSSXSA
    ASASMXSAMXXXAXXSAMXMAMMXAMMSMSMAMASMSSMAMMAXMMXMMXAXSXMMSXMMSMSSMMSMSXMMMSMMXSASAASASXMMMMSASMAXXAAAMSXSAMAXMSMXSAAAMXMASXMXSMMSSMMXMXAAAAXX
    MMAMAAMMSSMMSSMMXMSMMSMSSMXMXMMMXAMAXAMAMXMSSSMMMMSMMASASMSXAMAMAXMAXAAAAMAMAMAMXXMASXMASXMAMMXSMMMMMAXSXSAXMAAAXMMXSAMMMMMAMAXAMASAMMSSMMAM
    XMAMXMXXMXAAAXASAMXAXMXAMSXAAMASMMMSMSMMMAMAAAAXSAMASXMASAASXXAXSMMSMMXMXXMMAMAMSSMMSASASAMMMXAAXAAXMMMMAMASMMMMSXAASAMXAXMASAMMSAMASMXAAXXM
    MSSXMXXXXXMMXSSMASXSMSMMSXMMSMASAMXXAMAMMAMAMSMMMMSAMSMAMXMMMMSMMAMMAMASXSXSMSSMMAAASMMXMAMXMMXSSSSSSXAMAMAXMSAAXMMXSAMMXXSASMSXMMSMMASXMMSA
    XAAASXSMAAMAXMMSXMAXAAXMAMMAAMXMAMXMXMAMSXMSXXAXAAMMMXMAXAXAAXMASMMMAXMSAAAXMAMASMMMMXXXSMMSMSAMXXAAMSSMXXXXXXMASXXMMAMXXMAXMMMAMAAAMMMXSAMM
    MMSMMAAAXMMSSMAXXMXMSMSMMSMASMMSMMMMAMAMMAAXASXMMMSAMMSSSMSSSSSMMAASXSMMMMSAMSSXMASXSMSMAMAXAAMXMAMXMXMASXSXSXXMAXMMSXMMMMMMMXSXMMSSSXMXMASX
    MXAAMSMMMMXAAMMMMMMAMXAAXAMXXXAAMAASXSASXMMMMMXAXXXASMAAAAAAXAAXMXMXXAAAXXMAXAMMSMMASAASAMSMSMSMASMSSXSAMASASMSMMASAAMAMAAAAMXMASXXAXAMASXMX
    SSSMMXXXAXMMMMAAMAXMASMSMSSSMMMMSSXSASASXMAXAMSSMMMMMMMSMMMMSSSSMSSSMXMMSMSSMASAAAMAMAMMXSXAMMAMMXAAAAMMSXMAMAAXXAMXMSASMSSXSAXAMAMXSMSASASX
    AAMXSXMSSSSSMSMSMASXASAMXAAXXAMXAMXMAMXMAXSXMMAAMXASXSXXXXAXAAAAAAAXMMSMXAAXXMMXSSSMMXMMXMMSMSASXMMMMXMAXAMAMSMSMMSAXMASAAMMSXSMSXAMMXMXXAMS
    MMMXMAAAXAAAMXAXMAMMMMAMMMSMMSSMAXXMXMSSMMMAXMSSMSMSAASMXSXSMMMMMMSXSAAXMMMSMMXXXAAAAMXXMXAAXMAMMAMXXSMMSSMAMMAMAXMMSMMMMMSAXXMAAMSMMASXMSMS
    XXMASMMASMSMMMMXMAMAMXAXAXXAXAAMXMMSSMAAAASAMXAAXAAMMMXSASAMXXXXXXXAMSMMXMASAMXMMSSMMSASAMSSSMAMAMSSSXAAAASASMAMSXMASXSXXAXAMMMAMXMASASAAMAS
    XAXXXAXAMXMAXAMMSSXMASMSMMSSMSAMXAXAASMSMMMMAMSSSXMMAXAMMMAMXSMSSSMXMAXAMMASAMAAMAMXAXXXXAMXMMSSXSAMXXSMSMSXMMAMMASAMMXAMSXSAMAASASAMASMMMAM
    SXSMSXMAXAXSMMXXAXMAXSAMMAAAXXAMXMMSMMXMASXSSMMMMAAMSMMMASAMXAAXMASMXMASMMMMAMXSAMXMSSXMXXMXAAMAXMASMXXAXASAXSAXSAMASMMAMAAMSMMXXXSAMXXAAMXM
    XXAMAMXSMSXMASMMMXAMXMMMMMSSMMMMAMMMXXXXAMXAMXAAMMMMXASMMMAXSMSMMAMSAMXMAAMSSMAXMASAAMAMSSSXMXMXMAMXMXMAMAMAMSAXMMMMAMSMMMXMAMXSSXMASASXMMSA
    SMMSMSAXAXAMAMAAAMAMAMMXAAXXAASXXSAMMSMMMSXMSXMSSMMMSXMAXSSMXMAMMXMXXSXSSMXAAMMMXAASMMAMMAMXMMSSSMSAMMMMMMMXMMXMMXMMAXAXAMASMSAAXXSXMXXAAAXM
    AAXAAMAMMMXMSMMXMASMSXSAMXSMSMSAMXMSAAAXMAXXXASAMXAAXMMSMAXXAXASXMSMMMAXAXMXMMMSMSMMXSMSMAMASMMAAAMMMAAMASXSMMSSXSXSSSMSSSMSAMMSMAMAMMSMMMSX
    MSMMXMMMSSMMXAXXXXXAMAAXXAMMMMMXMSXMXSSMMMSMXXMASMMSXMAAMAMXSMXSAXAAAMSMSMMSAMXAXXAXAXAAXASMMAMMMMMSXSXSASAXAAXMASAMAAXAAAMMXMAMAAXAMXAAASXM
    XMAXXXAAXAAAMSMMMMMAMMMSSMXAMAAAXXAXXMXXAAAASXSXMMAXAMSSMASAMMSSXMSSMSAAXAAXMMMMSMSMSMSMSXSAXAMXXXASAXMMAMASMMSSMMAMSMMMMSMXSXMASMSSSSSSMMAS
    MMMSMSMSSSMMMAMXAASXMXAAAASMSMSSSSMMSMAMMMXSAAMMMMMMAMMAXAMMSMMXXXMAXSMSMMMSSSSMSMAMXAMXXASXMSSMMMXSMMAXXSASAMAAXSXMAAXMSMXMXMMAAAXAAAMAASAM
    SAAAAAAXAMMSAAMXSXSAXMASXMMXAAAMAXMAMMAMAASAMXMAAMXSSXSAMXSXAMXAMSSMAMXMAMAAAMAMXMASMMMSMXMAMAAAXMASXSXMMAASXMSSMXXSSSMMAAAMAXMAMXMMMMSSMMAM
    SMXSSMXMAMAXMXMXXAXAMXAMMSMXMSMAXXMSSXSSMXMAXSMXSSXAAAXMASXXSSMSMAAXMAAXAMMMMSAMASMSASAAMAXAMSSMMSSMMAAAXMMMMXXAMMMMMMMSSSMSASAMXSXXAXAMXXAM
    MSMXAXAMMMMXSSMSMAMSAMXSAAMSAMXMMMMAAAXAMASMMSAAXAMMSMMASXMAXAAXMXMMXMSSXSMSMSXSMSXSMMSASMSXMAMXAMAMSMAMXMAXAXSAMXAAAAAXXAAXASMMAXMSMXMAMSSS
    MMXMASMSMASAAAAAMAMXAXXMXSSSMSAAXMSMXMMAXMASAMMSMAXXAXSXMAMSMMSXMASASAMAXAAAAMXSASASXAMXMMAMMMMMXSMMAXAAMASXSASAMXSASMSSMSMMXMXMAXMASAXMXAMX
    XSAMXMAAMAMMMMMMXXMSSMMSAMXMASXSXXMAXXSXMXXMXMAAMMMSMMSASXMMXXAMMAMAMAXMSMSMSMAMAMAMMASASMASAMXSXMXSSSSXSAAAMXXXSAMXXXXAAXAXSXMMSMMAMMMXMAXX
    AMXSAMXMMXSAXMXSSSMAAAXMASAMMMMMMSXAMMXMMSXMMMSSXSAXXASAMMMAMMXSMASMSSMXAAAXMMXSAMMMMMSAMSXSASAXAMAMAAAAMMSXMXMAXAXMMSSMMMSMSAXAMMMSMSMSXSXX
    MSMMASXSSXMMSMAMAAMSMSASMSXSASAMASMSSXAMASXMAXAAAMXSMXMAMAMASMAMMMMXAAXSMSMSXAAMAMMXMAMXMXXMAMXXXMAXMMMMMMMMMXSSXSMAAAAXAXMASXMASAMXAAASAMXS
    MAAMAMMAMXXAAMAMSMMASXXXASMSASAMXSAAAXAMAXAXSSMMSMXMXMXMSMSASMMXASMMSMMXXAMXMMMXAMXAMMSSMXSMXMSMXSSSXXASXSAMXAMXAMSMMSSMMAMAMAMXMAMMMMXMAMAX
    SMSMSXMAMXMSSSMMXXXMSXSMAMAMASMMAMMMASMMMSSMMXMAAMASAMAAAAMASAMSAMXAXAMMMSMSXAXSXMMSSXAAXAXXAAAAAAXMXMMAASMMMXSMAMAXMAMAXXMXSXMASAMSASXSMMSS
    SAAAXASASAAMAAXSAMSXSASMAMXMAMASXXASXSAAAAAAXSMXXSXSASMSMSMXMAMMSMMMSSMAAMASMMMAASAMXMSMMSSXMMMMMMSMMMAMXMASMSAAAXXMMMSSSMSAMXSXMAMSASAMXAAA
    MSMSSMMASMSMMMMMAMXAMAMMXSXMMSAMASXSASXMMSSMMXAXXMASXMAMXMXAMAMMAMAAMXSSMMAMASAMAMXSXMAAAAMXSSSXAXAAAMASAXXAXSMSMSAMXAAAAAAXMXAASXMMSMMAMMSS
    XXXAAAMAMMXXMXMMAAMXMAMXAMMSMMAXXSAMMMAXAMAXSMMMAMAMSMXMAXMSSSXSASMSSXXXAMMSAMMSMXAMASXMMSMMMAXSASMSMSASMSSMMMXAAMAMSMMSMSMSMSMXMAAXAXMASAAM
    SMMSSMMAMAAXMAMXSSSMSSMMMSAAXSSMMMAMAMXMXSAMXAASXXXMXMASMSMMAAASXSMAMXASXMAMAXXAXMASAMXSXXXAMXMAMSAMXMASXAXMMSMMSMSXXMAXXMAMMMXMAXMMMMSAMMSM
    MAAAAXSSSMXSSXXAMXXAMXSXMAMXXAAAMSMMMSMMMMMSSSMSMMSMASASAAAMMMMMXXAAXMMMSMXXMMSASXXMASASASAXMMAMASXMXMMSMMXSAXMAMMMMAMXSMMMMMXMASAMXXXMAXXAM
    SSMSSMXMAMAAAAMSMMMSMXAXMAXXXSMMXAAAAAAAAMAAAMXMXAAMAMXMMMXSXMXXMMMSSSXAXSMMSMMMMMAMXMASASAMMMXSAMXMMSAXASAMMSMMSASXMMAMXAMMSXSAMAAMASXMASXS
    XAXAMAAMAMMMMMMXAAAAMSMAMMSSMXSSMSSMSXSMSSMMXMAXMSSXSSSSSXASAMSAMXAAMXMAXMMAAAAXXSSMMSAMAMMSXMXMXSASAMMSXMASAMXMSXMAMSASMXSAAMMMXMMMAXASXMAA
    SXMXSMMMSXMMSASXSMXMMAXMXAAMAMASAAAAAXMAMXMXASMSXAAXXAMASMXXAMXXXMMMMAXXMMMSSSMSAAXXXSAMXMASASXSXSXMASAMASMMXMAMMMSSMSASMAMMMMAXSSMMMSMMAXMA
    AAMASXMAMAAAXMXAXAAXXMSSMXMMSMAMMMMSMMSAMAAMMMASMMXXMAMAMXXMAMXSAMASMMSMSXAXAMASAMXMASAMMMMSAMAMXMASAMASXMMAASAMMAMXAMXMMSSSXMMSAAAAAAAXXMXM
    SXMASXMASXMMSSMXMMXSASAMXSAMXMAXSAMXAXSAMAXMAMAMASAMSMMMSAXSAMXMAMASAAMAMMXMXMAMASASAMAMXAMMMMAMXSXMMSAMAAMSXSAXMAMMSMMSXMAMXAXAXSMMSSSSMMAS
    MAMASMMASAMXAXXXXAAXXMAXAMXMSSMMSAXMXMSAMASXSMMSAMAXAAAAMAMXASMSAMSSMMMSMMMAMMSSMMAMAMSMSAMAMXMSMMMAAMMSSSMMAMXMSAMXAAAXXMAMXSXMMMMMAMXAASAM
    MAMAXAMASXMMASMSMMSSXMAMSSMMAAXASMMSMMSAMAMXAAAMAMSMSSMSMMSXAXXXXMAXXXAXAAMSMAAAMMXMAMXAXXSASXXAAAMMSMMAXMASMXSXMAMSAMXSMSSSXMXXAXAXMMSSMMSS
    SMMMSXMXSMXSXAMMAAAXXMAXMAMMSXMMMSAAAMSXMXSMSMMSSMXAXAMXMAMMSMSXSMXMAMXSSMSXMSSMMXMAXAMAMMAAMASXSXSMAAXMAMXMXAAASAMXSXXXAMXMASAMXSSMXXAAXAMX
    AAAXMXSAMXMMSMASXMSMSSMMMAMXXASAMMXXMAMXXSAMXAXAAMMMMSSMMMSAAAMAXXMSSMAMAXAXXXXAXXMSSMMMMMMMSMAAXASXSMMMSMSXMASAMXMAAMSMSMAXMMMSMAXSMMSSMSSS
    MSMXAMXASMMMAMXMMMXMAAASMMSASAMAMASMSMAXMMMMSXMASMAXMAMAAAMXSMMXMXMAXMMSAMMMMMMMAMAAAAAAAXXMAMMMMMMMMASXAAXXMXXASAMXSAXMAXMXSAAMMMMAMAMAMXAX
    MXXXAXSXMAXMXMAAAAMMSMMMAAMXSXMAMXSAAXMSMMAAMAMAMXSSMASXMMSAMXSAMAMAXXMXMMSAAASMSMMSSMMSMSASASXSXMAXMAMXMMMSMAXASXSAMXSXMMMAXMMXAXSMMMSASMMM
    AAAMXMMMSMMMSSMSMXSAXMSMMMMAXXSSSMMMMMAAAXMMSAMSXMMMXXSMAMMMSASMXAMSSSSSMASXMXSAXAMMAMXAMXAMASAMMSMSMMMXSAAAMAMAMASXMASAAAMXSSMSSXXXAMAMXAAM
    MMSXMAXAAXAAXAXXXSMMMMAMXAMXSMMMAXAASMSSSMMMMXXXASAMSXMMMMAAMMMMASXMAXAAMAMMXAMXMMMMAMMXXMMSSMAMAAMXMAAAXMSMXAMAMXXAMASMMMSAAAMAMXSAMXSSSSMS
    AXAASMMSSSMSSSMMMSAAMSASMSMXAMASAMSMXAMMMAAXMMSSMMAMMMSAAMMSSSMSAXASMMXMMSXSAXAAXMASASXSXSASASXMSSMAMMMMXXAMSMMXXMMMMAMAAAMMSMMASMAAMXAAAAAX
    MMMMMXAXAAAAXAAAASMMXMAMAAMMSXAXXAXMMSMSXSMSXAXAASXMAAMMMMMXXAAMASAMXAXSXMAXMASAXSASXSAXAMXSMMXMMXMAXAAXXMAMXMASASASMMSSMSSMXAMASASXSMMMMMMM
    SSMSSMSMSMMMSSXMMXAXAXAMSMSSMMSSMSAMXXAXAAXXMMSSMMXSMSMSSSSMMMMMMMMMMSMSAMMMXXXAXMASMMMMXMAMXXSMXXSMSMSSSMAMMMXSASASXMAMXAAXSAMASMXAAAXMAMAX
    AAAAXAAAAXXXXMXSASXMMMXXMASAXAAXMAMXMMAMSMMXAXMMMSASMXAAAMXAAAAXXAAMXMAMMMXMXXMMMMXMAAXMXMSSMMASXMAXAAXAXMASXMASXMAMMMASMSSMSAMXSXMXMSMMSSMS
    SMMMSXMSMSMMSMMMASMAXSSMSSSMMMMSMAMAXMMMAAXXSXXAAMMSAMMMMMSSMSMSSSMSAMSMSSXMSSMAMMXMXAMXAXMAASAMMSMMMSMAMSMSAMASXMXMASAMXMXMSAMXMXSMMMAMAAAS
    XAMASAAAXAAMAAMSAMXSMXMASAXXAAMAMASMSXXSSSXAXSMMSSXMXMXMMXXXAXMAMAASMSMAMAAXAXXAXXAMXAMSSSMSMMASAAXAAAMXMAASXMASXMAMMXMSMSAXSXMAMAXAAXAMMXMM
    SXMASMMMXASXMSMMAMXMXMMSMMMMSXSAXXAMXAMMAMMAMAXMAXAMMSXMXSSMSMMASMMMXXMAMSMMMSSSMSAMAAMAAMXAASMMXSSMSXXAMMMMAMASASASMMMAASMMMMSAMASMMSMSSXAA
    XXMASXAAXMXMAXMSSMMXAXXMAMAAMAMAMSAMMSMMAMMASMMSSSMMAAAMAXAAAAXAXMASXXSAMMAAXMAAXXAXSXMMSMSSXMAAXXAAAASMXXASXMASAMXAAMMMMMMAAMXAMASAAAAAMXXM
    MXSASMMSSMAMMMMAAAASXSMSMMMMMAMAMSAMAXASMXSASXAAAAMMMXXMMSMSSMMXSXXMSXSMSSSMSMMXMMMMMAASAMXMASMMSSMMMAXAASASASXMXMMMASAXAASMSMSAMXSMSMSMSMSX
    SAMSSMMAAMAMAAMSMMMMAAAAAASMSSMMXSAMXSAMAMMXSMMMMSMSSMSAAXXAAASAMXSXMMSAAAXXXMMSMAAAXSMMAXSAAXAAAXMAMXMSMSASAMAMXSXMAXMMSMMXAASAMXXAXAMASAMM
    MXMAXAMXSXMXSXXXSXAMSMMSSMSAAAXMAXAMXMAMMXSAMMSSMAAAMMXMSSMMSMMASASAMAMMMSMSSMMASMMXXAMXSMAMXXMMSXSASAAMAMXMAMXMASMMMXXAMAXMMMMAASMAMSMAMAMA
    ASMMMAMXXASMXMASXXXXMAAAXXMMMMMMMMSMAXAMXXMMXAAAXMMMSSMMMAMAXAXMMASXMAMAXAAMXAMXXXAXMASAAAMMSMXAMASAMMMXXXMSSMAMASASAAMSSMXSAMSXMSXMAXMXSXXX
    AXAAMSSXSAMAAASMAMSSSMMSSMXAAAMXMAAXSSMMSAASMMSMMXXSAMAAMAMXSAMSMMMASMSMSMSMSMMSXMAMSXMXSMXAAXXMAMMMMSXMXSAAXSAMAXMMMMSAAXASMMMMMMAMAMMMMMSM
    SSMMXAAMMAMSXSAMXMAAAMAAXMSSMMSAMSSMMAAAAMAMXMAMSSMMASMMSSSXMXMAASMMMAAAAAMXSAAXAMXXAMXMXMSSMSSSMXXSASAAAMMMMMMMASXMXMMMSMMXXAMAASAMASMAAAAA
    XAAAMMSMMAXXXMASXSMSMMSSXXAMAMMMMAAAMMMMASMSSMASAAASAMXAAMXAASXSXMAXXSMMMXMASMMSSMSAMXXAXMAMXMAAAAXMASMMMSMMAXAXMAXMSSMXAMXSXMSSXSXSASXSMSSS
    SSMMXAAASXMSASMMAXXXXAXXXMAMMMAMMSSMMSXXMXAAASMMXSMMMSMMMMMMMMMMMSMMXMMMSXMASAAAAAXSXMASMMASXMSMMMSMAMAMAMXSASMSMSAXAAXXXSAMXMAMAXAMASAMXXXM
    XXSXMMSMMAASAMXMXAMMMMSMSMSMMSASMMMMXMAMMMMSMMXMAMXAMXASMSMSSXAAAAAXXSAASAMASMMSMMMMXAMXASAMXMAMAMAMASXMASMMAMAAAMMMSSMSMMASMMAMSAMMXMMMMMXM
    XASXSMMXMMMMMMXXSXMAAMAAAAXAASXSMXAXAMXMXMAMXMAMXMSSMMXSAAAAMSSSSSXSASMMSAMXSXMAMAAXASXSMMASAMAXASMSMSASXSMMMMSMMMXAXAAAASXMASAMXAXXAAAAAXMA
    MSMAMAAASXMXSXSXAASXSSMSMSMMMXMSASMSMSMMAMASASXSAAMMASXMMMMMMAXAXAAMAMSASXMMSAMXSMXSMMAMASXMXSXXMMAAXSMMMMAAAMAMXXSSMMSMMSASMSXSMSMAMSSSXSAS
    SAMXMMSMSASXSASMMMMAMMAAAXMASXAMXMAAAAXSAMMSAMASMSMSAMAAXXSSMMSMMMMMMMMMMAMASASAMXASAMXMAMXMAXXASXSSMXSAASMMMSAMXAAAAAXXAXMMAXAAAMAMXAAXMAMX
    SMSMMXMASAMAMAMXSMMAMMSMSMMASMMMMSSMMMXSASXMXMXMAXAMXSMMMMXAAAAAMAMAAAXAMAMXSAMXSMMSASXMMSXMAXSSMAAAAXXSMSAAAMAMAMSSMMMMAMSMXMMMSMAXMMSMXMAS
    MXMAXAMXMAMXMAMMAMMSXXAAXXXAXAAMAXXMXXXSAMMMAMAMMMSMMMXSAMXSMMSXMAXSMMMXSSSXXMMMXMASAMASAMXMMMSAMSMMSMXMMMMMMSAMXMAMMSMMMXSAMXAXAMMMSAMXXSAX
    MAMXSMXMMXMAMXMAMMAMAMMXMMMMSSMSMMAMAAXXMXASASASAAAAAAAMASAMAAAAMSMXMMSAXAAXXMASAMMMASAMAXSAMXSAMAXAXMASAMXAXSXMASXMASXMSAMXXSMXSASAMASAMMMS
    SMSXAXAMXSSSSSSSXMAMAXXAMAAMMAAAMSAMASAAXSXSASASMSXSMSSSSMXSXMMSMXAMAAMMMXMMXSASXSXSAMXSAMXXMAMMMMMMMMXXAMMAXXASAXAMASAXMMSMMSXSXMASMXMASAMA
    AASXMMXSAAAXAXMXSMMXMMMSXSMSXMMMXXASXMXMMMXMMMAMMXAMAAMMXAMMMSXMAMAMMMSXMSMSAXASAMXMXSAMXMASMSSMAXAMSXMMAMSMSSMMXSAMASXMAXAMAMXMAXMMMAAXSASM
    MXMASAAMMMMMXMXAXXXAXAMMXMMSXXMXXMAMXAASAMXSAMAMAMAMMMSXMSMAAMASXSSMAAAAXAAMMSASMSAXSMXSSMMXMMAMXSMSAAMSMMAMAAAAAXAMAMXAAXSMMSMSAMSASMSMSAMX
    XSSMMMSSXSAMMSMMSSSMXASMASAMAXSASMAMXSMSASXAMSMSXSXMSXXMAMSMXSMMAAXAMXXMMMSMXSASASAMXMAXAXMAMMAMXMMSMMMAAAMMSSMMSSMMASMSAMXMXAMXXXSAMMAXMXXM
    AMAAMXMXASXSAAAXAAAASXMXAMASAXMAMSXSAXASMMXMXAAMAMXMMASMSMMSMAMMMMMSSXMSAMAMXMAMMMSAMXMSMMSMSMAMXAAXXASMXMXXMAMAAAXSAMXMAMXMMMSAMXMMMSSSSSMM
    XSSMMAMMMMAMXMXMMMMMMMAMXSMMMSMAMXMMASAMXSAXMMSMAXSXMAMXMSAAXMMSXXMASAAXMMAMXMAMXAXXAAXAXAAAXMASMMMSSMMAASXSSSMSSXMMSSSSMMMSAMSXMASAAXAAXMAX
    MXMAXAMAMMMMMMMMMXMXAMSMMMAMXAXXMAXMAMAMASMSXAXXMMSAMAXAMMSSSMASAMXXMSMMMSMXAMMMMMSMSMSSSSMSMSAMXAAAXXMSMMAXAAAAMXSAMXMASAASAMSASAMMSSMSMSSM
    AAXSSMSASXSAAASXSAXMAXAAAAAMSXSSSSMSASXMAMMMMMMAMASMMSSMSAMXAMASAXXMMAMMAAXMSMXAAXXXAMXAAASAMXMXSMMSSXAAAMMMSMMMSAMMMAXXMMMSAMXAMASXMXAAAXAX
    SAMXAAAAMASMSXSASASXSSSMMXSMXMXMAMASAXMMMXAMSSSMMAXAAAAMMMMSSMASMMMMMASMMSSXMASXSMSSSSMMMXMXXAMMMXMXXMMSMMXAXAMXMASMMSMXXAASAXMXMASAAMSMSSMM
    MMASMMMMMXMAMAMXMAMAAXAASXMASAMMAMXMSMSASMAMAAAXMMSMMSSMASXSAMXSASAASASXMAMXMXMAAAAMXXAXXAMXSXSAXAAMMAMAAXMXSMMASMMMAMAMSMXMXMSMMAXMMMXXAAAA
    SXXXAMXSMAMXMAXMMAMXMSXMMAMAXMXMASAMXMMAMXXMXSMMAMAMXXXMASXMSMASAMMXAAXXMSSMSASMMMMSSMMMSXSAMASMSMSAASMMSASXSASASASMASAMXMSSSMAAMXXSAMMMSSMM
    MMMMAMAMSMSMSMSASMSMMMMMMAMMMSMSASMMASMAMXSMMXMXMXMSSMSMASXMAMXMMMXSMMMXXXXAXXSXMXXMAASAMXMASAXAMXMXMXAAXAXXMAMXSAMMMXAXMMAAXSAMXMASASAAAAAX
    SASMSMXXAMAAAAAAMAXAAAAXSSSSMAAMASMSASMASAAAAMMAMAXXAMMMASASXSMSMSASAASMMMMSMMMAMXMMSMMAMMSMMMSSMSMSMSMMMMMSMAMAMASAMXSMSMMSMSMSSMMSAMMMSSMM
    MASAAAXSASMSMSMMMXMSMSSXXXMASMSMMMAMAXMASMSMMXSASMSSMMXMASXMASAAAMASXMAASAAAMASAMAXMAMSAMAAAAAXAASAAMAAAASAASAMXSASASAAAAASAASAAXAXMXMXAAMAS
    MMMMMMMSMMXAAXXMMXAXMAXASMSAMMAAXMXMXMMMSMXMAMSXSMXAXSXSAMXXAMMMSMMMMSSSMMSSSXSSSXSXMASMSSSSMSSMMMSMSSSSSSSXSSSXMASAMMSMSSMMSMMMSAMXAXAMMSAM
""".trimIndent()