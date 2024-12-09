package day9

val INPUT_DAY_9 = """
2186821950715250328941668393479265617090512492363157186398211766406974801889595085445516213472297139792054224197515928695253845692345845854369302585241170813790952095769872809116914568111089377669671167262263621559725352458132295163491816488135731265614068418894497944941730566425678697595197967814573712119914563349833583335027447142205743668953145162244219804159769120958527996271705023844254481576679242468370839173839275758492241931846245904027876174689484167329183317626013175491157396603759171724771485248461321121606165958368802674788474894970704682991590763335439890573722591687586029236131688454968266301780855572131718187143666613396061234082757470911043812813959342208531991626287880559522486272973162404660579841716590921573283665829055629637989844114038633637836282294912745652495091788053545982165866402111218859223163916481916734466245978365292497297067268912975091694922663999418945106453844585602070973045322992861860158231106213327770391345188562776848209182442010358556467726151644879732607917598469676894498713387473273351788087715878135352995331774853227222442643186895713382959490501299707793646539742517468876511964293622129253378037823376623196297844777643725658253618937283256494715725676940154225413162871332361375607139862064828230768153713986803887485824826769182275287795251425439842928267968421484577576570317297282887577246292395883328279953772314853624981677399529412730698863506937524126235211237786454141724978594884794915313044581729485247686328189611151763991321739767575393502415308625118178348174296995583686231791462954792032314822699018965799201480323415861978236213405859827854337841607866374188325078991827545810555840248062512418506520448689778486205742731664279358128314278493316715483013798210279025681087992139344764364785637462843520389258402151149775936067905469447931811235164254736944523257293533793150873422632450259295938664498359162713989543183348461671276257647087871791623321805368265696769732345531465024657010362473635985304541213422977484552664483692356380268011281022355891692333301476363154354966442292862012843598913793244761794635942770795251572935572759235912778868193875113761605838549310701320647248345816701870802584178653859360298577655547985580811735966363314210458194698392784196777959559623791093797791272148545467936275953770261187682631677124902323855148749749574927221156938849537240985131827482122374574856264674857997242019754975359072871347433981529026532299922697363838817682542538947398557077935333436776865835847355434089693364905085452319131899445259847733532125343745914329986230113066579654128977341499146998889063886936755126948266832770863831788283278752573546683970257432487555806520342525211638176833124532171896154945622140312010734873115185655386938024257572789283904386905872705296916130794694288191105652567085485722194827994943267177583542753143398929524286535885682333602681776774988686591114943696179972472957203479989295229427939496753935384275237896235270892852227023542339916085685639413638977813737478997568659211261518336125386394736077701348715723501681679228991730286378491028357268779458478455589985367163734741191992892254863886392392456065521540688069208788152389642462611452273930631978956392504821639280306346253478199267697459775220777475716998173279385129974812791038606449327322823132822488737416975522571616193115476914421879308614355616798661794218264091799595941495543034595996977913749531285318746666175750997881292269783552846962963035325278953965216565248840606375421587746683706637826066602549465647292517921465945481205722503916908918464613422329672459257789378714229024574595823397896867439850728785913144721380474516189787941145555079918713358931123170748654133595778515689562175943691881266894621921661421193944408418637193961444825389856933769446812157137819419692897439873163343180708884851682122544472071343694192599767129107888497159828337191024444672301698577173764381962636394462974964477128773293287712195025784331445423881484249217947319888997964882724590959630921589854711966884805169576644237122333331561242704459977222803471986121208135954735577542731277691040568051865531402849119254384848738852508191875155945776761728921877152230355527962019568699762164614853229998628728626848329420289665972669148843812376397771582739799289581563396950533827703839379625704123286068935420879435256810787087869419468341505849659620109681807594266159541389353180867780137462113699964042228527311522852235147237609083926491844566323586335868519456429412269099529125335050589562421110441537792930377830305292181248931989667723437187968553768050674731902310376366142326729334715017871328574060154557142476756425117176282912253295958284321563444060762624375322125685168691139078624349664831647896783091838735389330246782739525721480916512739037532150697544231311291797371340364970996574276266458729282664936826912910143095602142612650854127693111521631864332581549998636333999352097671298991846168658872211172328771132856254201911686092386021959488459933526985676250849848869494976379477223851994462398887718688646294570281372881185894690538083614433978064859626859179883039421038816976499993708746898049704281692974905485111770298949899175487377243487558583878133435860315563685815159554478922162027844868459411504456633045229429517247623592586840797363405810194231169768602415531993688067177728792436856991502896955399173897809945832266283167255226687914198748767396855410327987701582756044715298188586165514223741278118984639431349231711143837905491665958828573208186404676248419239081819688554698275873855745811126941974587783235846795666723554105439886440684436287415536615988159805364895045563665512370342473119691272517803594134223964235611762967687779113996522982889206732772250737259312588862467819329906632508355342296674527823898632940554294316970196064937087589913582997418412132458435628113964873556788091949642943667818068293862706194872684621679391621155035302952782137149538364857733176189028955032516862702674673045902876657221843077857368774326769984879888446233196261584168228262244678994960767240814263959149627478578617289153324377624647118479213718694384256558205726481034863992885346792778784742246156721667833818233291487993821097382129641198453299369585943769311453238714232124266966774963502120657788611685612182606050861123436440501935349161856688148944791942198890518693406853258437778259807977109617584028207998764585637479417238696561468994792696808781304418737645343768787825808673722543831976175317677647233826287192925131394078448414797427111995904792934319845138535318601284342717363119567144942628838955498487526373702396274817547484893194354431557454466660568118952998898629677878972292908685158284595081901963682992269052384151801691718953986587138933857926376434562951724274732642399733805390738638412450953946825933247434661748408076828987539460193475956559887343131810297515359397277479229282594671156516126580813059238597503362765074894892472117225634499794659297742115925633898271589634474317793232779433896128125910121136535754715994907176762735864144884027457564497096463342887288677063943589448423342280919724287940668442718598316350831388837447939527625266252867194217363718838383995695646029319256989734954415627860447971813619989424732393603993825735726878933849491152811875765510533683567481292570904379285562749270457814256270558862584722792819146633835886662560951892377236679042599563249396403494755042799685989045226431331367185925376861761572932686121750928065652278351574208981609213486450628086799171347258638220356241953575893425766727448249879483439731241935275981978629299433417355156355479252976725607990252554414559917018486851391673499810311584495567699393311893313194879493927061218083562147899986645097126045288251145783678924922510994689461350353815607946433218196841758970797937503919646792222118781818973121172782187591567651566436756128194626964345826879826510987916922330655364581578151048683378427951619258191132367333617526133967916286559089103897137137736429152957308369655576348262612728115878104064553727911010994086899395469610407128784397896073618117265658651224404537406031947050796295419490618244897549353510915170858989384547607238746486479935643792431342765819469096633036772796452673852263453435662161609812877529428070642993686452782819718670482039842685953915646936552668428213779566926326859013945515758326108574677626141450401874576966336452753386137137931548713792443328676394487913853076231545503752842222169946799464155471869544716745429540788436204878174527413563442939888065316099852512262864988942799828683178569661518010736683143992812481602062283297876375894698198375262573905515487868327047688312383048583738674374577265385035255776419727874190451710543639194658815823185178571820574534178457395215662954824497783164963016124130573923778947204040483377242876246063771974732796628893143483317532875485653659746222938066424116687930334013198345858183811747414593562062303268194219712016942037233895304043796157205099883574833973896734394865267382791668398756982620192770852238322359932158368642698913669466595854996275332272707339737350783032522997637756514848414313849034111682425574834975677426547187739566714025532543366046115446955232191378586952402613965885854877329135272598804879414446863599655511739962174617104129451446108164558243643367639786591562586786878362794895882381892661767099484498996850259894404196389047732976922497139580113814945340341669292680391163961193819980546929975867228149835936741767225451497842169539999493168515192028905981772615708572531521261066951475967022466252531020296561796138998030189992897698211360843075618993934553927199151266899957565671459085717714115029972073701917195828126280283951426120761462611866848670452998839468111849489880234876509680818246284697485517315027707141352544825089583738476879752213342982515945953557179936126330688969637833392836296865143873551862407963547645837814198110447064413847484826372932217073291615181560577182859290874396294694407038257959569581352016733669582218519039667815137892115056639263388277461298502753441170759581307385148897919118713441524873234696221085369561571241841898835233914583692137191527934383989389535623303539511599338928603421243488442810893765697278142458224520755670627125469531947744818544371837818023316283625867899658378476917044185620689337304335821441828983506262435193994933708997345632505539838269728678423968566021223998275847516480351814114181492931347476477996118182966742445533599716977611923536763935432542119552842959785749374920556752562674842793124787553820379584956318209854168833402278288086222442469752629536805759579781473338319837529778679790321683321466708188142393459672611942334974161017941840466727388158465614389249948571982481569883436288595783243187804152287856245063968295321892482145302122342450533455733469115336137772926254414279275999204364597051918698312978579686289541583437786120215694627220162186196156245484211342982521421987631397447592123731891067822078326132582338222230665172786925629226668144547455312490428791347693593813725390732196608297316172748819163722854616817923182138502371313533136515879195408337559880755574969735409955413967452092656287459137235853537447956156242518233127671066277428237056142241879697766134147792146250932317589652715112651526684567264228439945936096626334821314779152297962696848434133135465591165848682144548319432673396263260993574893744496073334822812692385523495630593067958461749237393293407746484981964082257966466086543029576533282524508542699870199074594287508832976664602270531868852412486068252254411016172632802943773058198044871545872298358048305639207526316229143594186682448274993947131778403293282785642155911524206691727564924876232159931563184247523212672325367597276249614588518063185575976674806470496772475643862920197519635868172769946077393333546233748344771260723366528031612988624250684793999638184634811646991130282538864473141114223142217526603794795871546740684784992158921594519714676421328279962270822769648843628865128078355070425719128956946242366583936163416128154870322679911462894074134733441355258869886294845795649213782328997058158053316259261330308342345730885686681033323638163021979497155313211569858033927625998871458663256640947488498149278730425330216516128074399924161224232120302643747752226531987429319093619690757845486540194588461875819025725213683750308277336950619247893540849730295956638182262784831458517794986938745429771061867744464164434678422193932029829567831826921212551565455463177630348877544162311852509084289534802682909072458432134691681553594139342881217024569157781391137664546791215490447553325358458918516612721376978568646639719493189691784279528669436516861099562712862149808454118485922142732162971772396374208611222851691122958566874090206120179828648660785931546641919345701511708552507167907189544196845967666789437968538597376544808419316440348466853723552856748773727157168919872717971991339885342175271432371153309949168767951575438855384862771317182767708042436636181939139124505943761178422934679222616162975737401510962480308616139149321161851019191376226012212313965690634677402142614133445644375631524767433330675471114850213891323868661380636038977537406147929322244954918795611522996484419955817196271253293525379620401714683476595980501849196831405047908466199490493187566224987266617128646548797180444941103149761912463094394415501657729751137096264054865465648594533787245357527824928213978238416515494383696527899963398373684147556316206234307515703283774893675370499774217613889858101289929748251325768822258745624933262551887310557436869145406483272033522818783020379741101523791652681474919623145375666222603414111559876658494919763991771559947571997927468072788769478258935325162576627445401960653662821333435545687845958596592975796392598839448880515960182596245493674245774096926869339034798087277982147285365844348044889647778616936927672692696045294363849139304926271083427127634095686743788469672769289069349028306952365880115668175520423599403893283897984125463535482494235581597671794252823026644519787598612338211110701813175884908730957541782380807415992489637348197746728317545861949687261252778830151567328984874625372259898546889460225490144830308767276959479115365210238014741344873662212679724554979495632641461915857383954177946067379294338415316965538798801570428426728028245318474763423118887412619920167365623848545146489675384020402037706616709926182663251734571339257586439511802156679468899638562477262489277513254733555986214481419049712237377444531549233665544970747833401898319397438655481643194012529715635354989933264255191788574656545189675410387414651836304991522651251637968296588451231260466918944647438325344975989244123862732161511116985462362770771621519022938089719722365471703670111666478769648271151769972924135056163955592947566288139764502846259838216071236681902353553520134260471218773988127345366018446812369565544738567634153856892558669033256385316130206111455059216744465099995424247592436083701154671258219133126095418943369293154595945331141027714344649623452767622054465278404960568776934473594742403924738415701412429333921011351420301243439231873622334145941835608229314281279830163715837345449784893328666028878045923123701418535652336898825877794821286745318025156781324335517123198285603284768093316848577373759645316267528533427099332046143582764312544917728377703328334623506223511889933358707761772446784554288566286897656663819041542552941361851373303626329171324024661070486981575553258869684763785951602654222226155113896534629011349781351610719098663121203677807122851667576474766561463247439123294276383747729777331354491978198171483564343472692221389419326358218642921414173672233224927861507894247084739227822082147868571464549296275739445336319358923570908879254543158824394591394470429096202262883511981761626126237969935431457150471037449771837033731246732674822243231868478513768781729882116318137094203659958129109312113612143275997251164295374371101856199895225094404555782616811555279288459654559394949768347191733141805617915534903160678387555425334022886226705282317874543256703130818183901867561664265861718216283471177964453280521117496584604044232861175069642567564852697429297084868399109483989464823515609039791576286161128318482411516952647677507344139467756167584737151192596130295428782119373767705793855140563820404330606759499346848487673223796468411749603299841158487017821913379168328071887698391129141441857833324491689296236914918357704489282679697431461421888998543562431176317419895010779377178065174669923974354198195523306550446061418157607322465624953946978532461376388894143188401916102888474786868178147860915958907023856178799851225825161353882647356085705897666031367161179773726521455567245622329145198455643193969945464930692211231613918061614527105784297636714350102241254226903369135771753336675373595369644318473485992210513133238976549045189790884525542389152367972120612040102565108795944715288673685084321749627517386912775773526784476874331341447050837215811643477365148067733672263122692163495986642354796598484061567779631165525873103662678161192657957622228849292562726225578075124517204714899129952068796988464926788859496438962622871787947462842882369659481837125077928889189117186236467936409656973588575528205812616050657542167830617173769689625242891477956186284830327545653170785485721546689615347083231731926562346387824369633848359839814469386414744835256177302644501959903189604998925791575328986068157154397070149168402643256798673512713364658441505282371943464517281015701169286669607328907829786478996585838425932752724333967291498915487652691020528859809291328985347519856335351224841862745950557851839287217948597178143166336983754733365216721974236029923352714676431353374199254173468435262673801397268182297326575845506313495427384132509457788421384024252141371944921856534164616933468187303130588817929953893281584362393715253485962315673949127352382747322318109022106056166593435490266897507528737061598413849025943617644381359516255174853032898617511616417417655091562481502630864142379516315762689856991055667916201477101452251411735789955368716541159367178095502049392371511824732555475683533964949536372713407660761238794322565429273491403299665779523369778915581277175417181764697049654334551245177029498882634157136565764529244534608712429251537863207415569739961654588120822224791365326945879521535376345413796792926344556461118855519878284090128226478978466330505843534563368779449859769513218065418226229554112652672471923134788422489449702963592170102932522831161553467938907195779014849119643810399653594315584564196827151335152388922691428755534823275344797115693410487968104721814835813436726394472187139568367771803359323221664996921289141844365499202539316213692468849112312068419169422060609882217526497049646722242037873866314087604016754795313344988676716953263275464858173675645358187424655492829448957183671222979837122229441993977072131091949793718868768316587923566730239332247931298882712857807996587812463666465282944357845350898949355177464314159323719059729811219116177789187123557236119930469421204184847091549493892460618254639393781966189651348176487251787277521181698937485145333514126790696415212776521341539366298116282987842121693459526486757863527111867074373216676686189385837282424467984749268222919566697012526037205149196452411060243927763390954074424547382294928491729552894215261666869624834780511641311617714320113629288132482113384828108127246486861019946199198677576479986869454681686896451345349183563758747643277573707317598982643277914976466457666895975571924528265587191235973786236220179471123021117754263255826099967536678495918979463248282584203437845333746141926084305294661611904761156988274022495121595328824413455697571749992217223285414273939377952570927537122859215240479142459494892338703760156516347678582351406710159948809235828145955959472887701145552458488551486599809275835062492643847852885654285988367539967427159935298067964093681612343617625741837479777713726916526320288025465724205329242241115486442678555985786018107212473281121161504
""".trimIndent()