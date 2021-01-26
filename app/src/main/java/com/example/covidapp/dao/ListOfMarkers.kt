package com.example.covidapp.dao

import com.example.covidapp.model.SingleMarker

class ListOfMarkers {
    val markers = ArrayList<SingleMarker>()

    init {
        // data taken from https://www.gov.pl/web/koronawirus/stacje-sanitarno-epidemiologiczne
        // DOLNOŚLĄSKIE
        markers.add(SingleMarker("WSSE we Wrocławiu", 51.10924922709352, 17.065933541007873))
        markers.add(SingleMarker("PSSE w Bolesławcu", 51.25774845168914, 15.567362756348619))
        markers.add(SingleMarker("PSSE w Dzierżoniowie", 50.726472778817275, 16.647541414005687))
        markers.add(SingleMarker("PSSE w Głogowie", 51.661481348746264, 16.09582448334473))
        markers.add(SingleMarker("PSSE w Górze", 51.665725862623695, 16.540763008211655))
        markers.add(SingleMarker("PSSE w Jaworze", 51.05121751258123, 16.196345969835143))
        markers.add(SingleMarker("PSSE w Jeleniej Górze", 50.90006384146814, 15.729152629354141))
        markers.add(SingleMarker("PSSE w Kamiennej Górze", 50.78148163587501, 16.029135898663558))
        markers.add(SingleMarker("PSSE w Kłodzku", 50.433433989468355, 16.65071116981796))
        markers.add(SingleMarker("PSSE w Legnicy", 51.2030339701304, 16.16458737169084))
        markers.add(SingleMarker("PSSE w Lubaniu", 51.11903907788392, 15.286497811773417))
        markers.add(SingleMarker("PSSE w Lubinie", 51.39859585395865, 16.19971298518867))
        markers.add(SingleMarker("PSSE w Lwówku Śląskim", 51.11189814217573, 15.579002041001072))
        markers.add(SingleMarker("PSSE w Miliczu", 51.52743947654289, 17.275268998684513))
        markers.add(SingleMarker("PSSE w Oleśnicy", 51.20665949760065, 17.378774556465004))
        markers.add(SingleMarker("PSSE w Oławie", 50.94966769667859, 17.28600979861036))
        markers.add(SingleMarker("PSSE w Polkowicach", 51.5031814533904, 16.06869780048027))
        markers.add(SingleMarker("PSSE w Strzelinie", 50.78407472761514, 17.064084756279016))
        markers.add(SingleMarker("PSSE w Środzie Śląskiej", 51.165825634087625, 16.589990029307913))
        markers.add(SingleMarker("PSSE w Świdnicy", 50.83820856465665, 16.480548613953452))
        markers.add(SingleMarker("PSSE w Trzebnicy", 51.305673791619434, 17.063473483273718))
        markers.add(SingleMarker("PSSE w Wałbrzychu", 50.785505091377956, 16.286581912096675))
        markers.add(SingleMarker("PSSE w Wołowie", 51.33633485027987, 16.643570185129928))
        markers.add(SingleMarker("PSSE we Wrocławiu", 51.12681638074574, 17.031318785124498))
        markers.add(SingleMarker("PSSE w Ząbkowicach", 50.58617788226713, 16.8098493139469))
        markers.add(SingleMarker("PSSE w Zgorzelcu", 51.14864387493014, 15.00797599861558))
        markers.add(SingleMarker("PSSE w Złotoryi", 51.12410455575742, 15.92013975628792))
        // KUJAWSKO-POMORSKIE
        markers.add(SingleMarker("WSSE w Bydgoszczy", 53.11885390602825, 18.005683540704325))
        markers.add(
            SingleMarker(
                "PSSE w Aleksandrowie Kujawskim",
                52.87517412812546,
                18.696128641153262
            )
        )
        markers.add(SingleMarker("PSSE w Brodnicy", 53.25776544338028, 19.406442598671823))
        markers.add(SingleMarker("PSSE w Bydgoszczy", 53.134946648241666, 18.009415485177932))
        markers.add(SingleMarker("PSSE w Chełmnie", 53.348664374978135, 18.44530533914593))
        markers.add(SingleMarker("PSSE w Golubiu-Dobrzyniu", 53.10920083676612, 19.07008744963996))
        markers.add(SingleMarker("PSSE w Grudziądzu", 53.49285968537418, 18.75400845635108))
        markers.add(SingleMarker("PSSE w Inowrocławiu", 52.79769718085257, 18.25873454284175))
        markers.add(SingleMarker("PSSE w Lipnie", 52.84352098531131, 19.182156677661823))
        markers.add(SingleMarker("PSSE w Mogilnie", 52.65888184889104, 17.94951691416592))
        markers.add(SingleMarker("PSSE w Nakie", 53.14037003117999, 17.59574144099575))
        markers.add(SingleMarker("PSSE w Radziejowie", 52.6231162399588, 18.526613540981725))
        markers.add(SingleMarker("PSSE w Rypinie", 53.062792401765435, 19.4108788121571))
        markers.add(
            SingleMarker(
                "PSSE w Sępólnie Krajeńskim",
                53.45900048342528,
                17.546615468334092
            )
        )
        markers.add(SingleMarker("PSSE w Świeciu", 53.406556888114025, 18.452870985185402))
        markers.add(SingleMarker("PSSE w Toruniu", 53.00941876436247, 18.571362085174567))
        markers.add(SingleMarker("PSSE w Tucholi", 53.58777598239086, 17.859789998680785))
        markers.add(SingleMarker("PSSE w Wąbrzeźnie", 53.279856221679864, 18.954075569835926))
        markers.add(SingleMarker("PSSE w Włocławku", 52.65704762303146, 19.062085269819164))
        markers.add(SingleMarker("PSSE w Żninie", 52.85276097069793, 17.719004369824397))
        // LUBELSKIE
        markers.add(SingleMarker("WSSE w Lublinie", 51.239949565529585, 22.508300829309835))
        markers.add(SingleMarker("GSSE w Dorohusku", 51.13512143231644, 23.802987123107336))
        markers.add(SingleMarker("GSSE w Hrebennem", 50.2767909244155, 23.588577927429448))
        markers.add(SingleMarker("GSSE w Koroszczynie", 52.07684213568686, 23.513574713985914))
        markers.add(
            SingleMarker(
                "PSSE w Białej Podlaskiej",
                52.031637395200306,
                23.109567196783583
            )
        )
        markers.add(SingleMarker("PSSE w Biłgoraju", 50.53415827123157, 22.716937998599633))
        markers.add(SingleMarker("PSSE w Chełmie", 51.15041142897611, 23.457637256288567))
        markers.add(SingleMarker("PSSE w Hrubieszowie", 50.80675137880805, 23.8892071562796))
        markers.add(SingleMarker("PSSE w Janowie Lubelskim", 50.69672248986572, 22.427669185113135))
        markers.add(SingleMarker("PSSE w Krasnymstawie", 50.98172888864619, 23.170276569774686))
        markers.add(SingleMarker("PSSE w Kraśniku", 50.92073994779968, 22.21625134093666))
        markers.add(SingleMarker("PSSE w Lubartowie", 51.45016040626767, 22.612374542805853))
        markers.add(SingleMarker("PSSE w Lublinie", 51.24542121462116, 22.546565554435727))
        markers.add(SingleMarker("PSSE w Łęcznej", 51.29081109763921, 22.876861127455797))
        markers.add(SingleMarker("PSSE w Łukowie", 51.929116374645645, 22.380028727472695))
        markers.add(SingleMarker("PSSE w Opolu Lubelskim", 51.15082247866564, 21.970658356288723))
        markers.add(SingleMarker("PSSE w Parczewiu", 51.64585041651375, 22.908519456301597))
        markers.add(SingleMarker("PSSE w Puławach", 51.41391378358546, 21.963164471641427))
        markers.add(
            SingleMarker(
                "PSSE w Radzyniu Podlaskim",
                51.784491944197846,
                22.61953017165119
            )
        )
        markers.add(SingleMarker("PSSE w Rykach", 51.62504649287185, 21.9351908121187))
        markers.add(SingleMarker("PSSE w Świdniku", 51.22723734224189, 22.699446212108185))
        markers.add(
            SingleMarker(
                "PSSE w Tomaszowie Lubelskim",
                50.44786207751967,
                23.416705513943327
            )
        )
        markers.add(SingleMarker("PSSE we Włodawie", 51.55700346036975, 23.553717613972232))
        markers.add(SingleMarker("PSSE w Zamościu", 50.716223982846685, 23.260435185113728))
        // LUBUSKIE
        markers.add(
            SingleMarker(
                "WSSE w Gorzowie Wielkopołskim",
                52.73992940959521,
                15.230594442840172
            )
        )
        markers.add(SingleMarker("PSSE w Drezdenku", 52.83940571069183, 15.835871898660532))
        markers.add(
            SingleMarker(
                "PSSE w Gorzowie Wielkopołskim",
                52.73711858856722,
                15.229199927494278
            )
        )
        markers.add(
            SingleMarker(
                "PSSE w Krosnie Odrzańskim",
                52.05193154249975,
                15.088461540966398
            )
        )
        markers.add(SingleMarker("PSSE w Międzyrzeczu", 52.44310091365701, 15.581209812140404))
        markers.add(SingleMarker("PSSE w Nowej Soli", 51.80296883912392, 15.71484943910453))
        markers.add(SingleMarker("PSSE w Słubicach", 52.3500838367142, 14.557498812137911))
        markers.add(SingleMarker("PSSE w Sulęcinie", 52.449793449044826, 15.116962540977106))
        markers.add(SingleMarker("PSSE w Świebodzinie", 52.249378249375624, 15.53190672748117))
        markers.add(SingleMarker("PSSE w Zielonej Górze", 51.92999111466359, 15.502864627472647))
        markers.add(SingleMarker("PSSE w Żaganiu", 51.612524377451436, 15.330533312118341))
        markers.add(SingleMarker("PSSE w Żarach", 51.6401309044147, 15.135924269792064))
        // ŁÓDZKIE
        markers.add(SingleMarker("WSSE w Łodzi", 51.761739605363545, 19.476821527468154))
        markers.add(SingleMarker("PSSE w Bełchatowie", 51.360692769244814, 19.377162042803512))
        markers.add(SingleMarker("PSSE w Brzezinach", 51.79882754438168, 19.753910498632777))
        markers.add(SingleMarker("PSSE w Kutnie", 52.232796672815525, 19.36441415631715))
        markers.add(SingleMarker("PSSE w Łasku", 51.59099559352853, 19.14707599862735))
        markers.add(SingleMarker("PSSE w Łęczycy", 52.048646568649374, 19.215061998639342))
        markers.add(SingleMarker("PSSE w Łodzi", 51.74375105357475, 19.465688269794857))
        markers.add(SingleMarker("PSSE w Łowiczu", 52.108145430896236, 19.937409227477307))
        markers.add(SingleMarker("PSSE w Opocznie", 51.37643416133313, 20.28848789862162))
        markers.add(SingleMarker("PSSE w Pabianicach", 51.66010902105895, 19.355107798629042))
        markers.add(SingleMarker("PSSE w Pajęcznie", 51.150329089433335, 18.9886624562886))
        markers.add(
            SingleMarker(
                "PSSE w Piotrkowie Trybunalskim",
                51.40534452694867,
                19.692982898622358
            )
        )
        markers.add(SingleMarker("PSSE w Poddębicach", 51.88912285316755, 18.95329445630806))
        markers.add(SingleMarker("PSSE w Radomsku", 51.06935162276409, 19.441319642795975))
        markers.add(SingleMarker("PSSE w Rawie Mazowieckiej", 51.767604196258496, 20.250306640959))
        markers.add(SingleMarker("PSSE w Sieradzu", 51.597317860967244, 18.721368727463826))
        markers.add(SingleMarker("PSSE w Skierniewicach", 51.956966938120445, 20.133881898636904))
        markers.add(
            SingleMarker(
                "PSSE w Tomaszowie Mazowieckim",
                51.528850440844835,
                20.010997998779136
            )
        )
        markers.add(SingleMarker("PSSE w Wieluniu", 51.21878389951681, 18.58195535443504))
        markers.add(SingleMarker("PSSE w Wieruszowie", 51.294814448568374, 18.160830098619407))
        markers.add(SingleMarker("PSSE w Zduńskiej Woli", 51.601017648242, 18.93653455630046))
        markers.add(SingleMarker("PSSE w Zgierzu", 51.84914264144918, 19.39826424817687))
        // MAŁOPOLSKIE
        markers.add(SingleMarker("WSSE w Krakowie", 50.0873426530891, 19.93792362742459))
        markers.add(SingleMarker("PSSE w Bochni", 49.97300558180601, 20.42791622742154))
        markers.add(SingleMarker("PSSE w Brzesku", 49.95718649193594, 20.604039727421195))
        markers.add(SingleMarker("PSSE w Chrzanowie", 50.13688250000345, 19.397393156262346))
        markers.add(
            SingleMarker(
                "PSSE w Dąbrowie Tarnowskiej",
                50.17362669374317,
                20.983691627426715
            )
        )
        markers.add(SingleMarker("PSSE w Gorlicach", 49.67110310882319, 21.174008734835358))
        markers.add(SingleMarker("PSSE w Krakowie", 50.088354065218105, 20.04684702742454))
        markers.add(SingleMarker("PSSE w Limanowej", 49.705917671675365, 20.424558185087683))
        markers.add(SingleMarker("PSSE w Miechowie", 50.35824870367469, 20.036693783249117))
        markers.add(SingleMarker("PSSE w Myślenicach", 49.84140483211726, 19.96341108509113))
        markers.add(SingleMarker("PSSE w Nowym Sączu", 49.62271458274521, 20.690306127412587))
        markers.add(SingleMarker("PSSE w Nowym Targu", 49.48347507059946, 20.032692183226686))
        markers.add(SingleMarker("PSSE w Olkuszu", 50.26823969978115, 19.570690356265604))
        markers.add(SingleMarker("PSSE w Oświęcimiu", 50.03483209312197, 19.200630440913724))
        markers.add(SingleMarker("PSSE w Proszowicach", 50.19402218492306, 20.290689427427214))
        markers.add(
            SingleMarker(
                "PSSE w Suchej Beskidzkiej",
                49.74136451315584,
                19.598828769742692
            )
        )
        markers.add(SingleMarker("PSSE w Tarnowie", 50.011403268875235, 20.981226098586102))
        markers.add(SingleMarker("PSSE w Wadowicach", 49.88582195578512, 19.493173498582852))
        markers.add(SingleMarker("PSSE w Wieliczce", 49.9793084747524, 20.05018316974885))
        markers.add(SingleMarker("PSSE w Zakopanem", 49.303333745635406, 19.960960598568036))
        // MAZOWIECKIE
        markers.add(SingleMarker("WSSE w Warszawie", 52.237740620153005, 20.98838535631729))
        markers.add(SingleMarker("GSSE w Warszawie", 52.23774719034618, 20.988342440971373))
        markers.add(SingleMarker("PSSE w Białobrzegach", 51.64991349148804, 20.951161883282907))
        markers.add(SingleMarker("PSSE w Ciechanowie", 52.87869292931064, 20.60174762749805))
        markers.add(SingleMarker("PSSE w Garwolinie", 51.89268590664616, 21.608085669798744))
        markers.add(SingleMarker("PSSE w Gostyninie", 52.447346797169246, 19.467188069813584))
        markers.add(
            SingleMarker(
                "PSSE w Grodzisku Mazowieckim",
                52.10694966471887,
                20.617722740967977
            )
        )
        markers.add(SingleMarker("PSSE w Grójcu", 51.8610593604135, 20.856215727470836))
        markers.add(SingleMarker("PSSE w Kozienicach", 51.586475440035365, 21.54689274095419))
        markers.add(SingleMarker("PSSE w Legionowie", 52.42199209447696, 20.93912134097635))
        markers.add(SingleMarker("PSSE w Lipsku", 51.15955789410799, 21.648196269779454))
        markers.add(SingleMarker("PSSE w Łosicach", 52.21256734507462, 22.717589269807274))
        markers.add(SingleMarker("PSSE w M. St. Warszawie", 52.26724387473846, 20.949568785154675))
        markers.add(
            SingleMarker(
                "PSSE w Makowie Mazowieckim",
                52.864739318797945,
                21.094033498661158
            )
        )
        markers.add(SingleMarker("PSSE w Mińsku Mazowieckim", 52.17986863999615, 21.56656759864284))
        markers.add(SingleMarker("PSSE w Mławie", 53.111705260687344, 20.384994727504345))
        markers.add(
            SingleMarker(
                "PSSE w Nowym Dworze Mazowieckim",
                52.42962538088416,
                20.72629541214005
            )
        )
        markers.add(SingleMarker("PSSE w Ostrołęce", 53.084321433218435, 21.590046456340147))
        markers.add(
            SingleMarker(
                "PSSE w Ostrowi Mazowieckiej",
                52.80337743829796,
                21.890395098659546
            )
        )
        markers.add(SingleMarker("PSSE w Otwocku", 52.10856333694708, 21.277057612131475))
        markers.add(SingleMarker("PSSE w Piasecznie", 52.07772274289007, 21.067519098640133))
        markers.add(SingleMarker("PSSE w Płocku", 52.54229540483732, 19.695549898652484))
        markers.add(SingleMarker("PSSE w Płońsku", 52.62985751182206, 20.375592185164344))
        markers.add(SingleMarker("PSSE w Pruszkowie", 52.159135848035525, 20.81824747688098))
        markers.add(SingleMarker("PSSE w Przasnyszu", 53.00994698812689, 20.884704998665107))
        markers.add(SingleMarker("PSSE w Przysusze", 51.361399767797366, 20.63343645629416))
        markers.add(SingleMarker("PSSE w Pułtusku", 52.70774688386151, 21.084559356329887))
        markers.add(SingleMarker("PSSE w Radomiu", 51.40412682283458, 21.137565227458825))
        markers.add(SingleMarker("PSSE w Siedlcach", 52.17638387252989, 22.288797085152265))
        markers.add(SingleMarker("PSSE w Sierpcu", 52.85265439504182, 19.666165705406108))
        markers.add(SingleMarker("PSSE w Sochaczewie", 52.22691240796589, 20.237314256317))
        markers.add(
            SingleMarker(
                "PSSE w Sokołowie Podlaskim",
                52.41024260294588,
                22.21849205632195
            )
        )
        markers.add(SingleMarker("PSSE w Szydłowcu", 51.23573828981671, 20.86646726978142))
        markers.add(SingleMarker("PSSE w Warszawie Zachód", 52.2076336768352, 20.816370243580558))
        markers.add(SingleMarker("PSSE w Węgrowie", 52.39638066696932, 22.018862327485174))
        markers.add(SingleMarker("PSSE w Wołominie", 52.338855331980426, 21.241736856320088))
        markers.add(SingleMarker("PSSE w Wyszkowie", 52.594180670203535, 21.457935098653937))
        markers.add(SingleMarker("PSSE w Zwoleniu", 51.358740410296505, 21.576950267333427))
        markers.add(SingleMarker("PSSE w Żurominie", 53.07195910200568, 19.897800098666863))
        markers.add(SingleMarker("PSSE w Żyrardowie", 52.05714186422298, 20.4505264563125))
        // OPOLSKIE
        markers.add(SingleMarker("WSSE w Opolu", 50.66633168338205, 17.938549812093587))
        markers.add(SingleMarker("PSSE w Brzegu", 50.85745624122483, 17.463452712098547))
        markers.add(SingleMarker("PSSE w Głubczycach", 50.203684351851784, 17.828269069754594))
        markers.add(
            SingleMarker(
                "PSSE w Kędzierzynie-Koźlu",
                50.33481630283861,
                18.147342398594454
            )
        )
        markers.add(SingleMarker("PSSE w Kluczborku", 50.9744937798694, 18.21723326977452))
        markers.add(SingleMarker("PSSE w Krapkowicach", 50.48329501345562, 17.97579979859826))
        markers.add(SingleMarker("PSSE w Namysłowie", 51.07322765052815, 17.7244300832678))
        markers.add(SingleMarker("PSSE w Nysie", 50.46681512962136, 17.33223504092494))
        markers.add(SingleMarker("PSSE w Oleśnie", 50.87482392992611, 18.417267998608402))
        markers.add(SingleMarker("PSSE w Opolu", 50.66427437950771, 17.92552199860298))
        markers.add(SingleMarker("PSSE w Prudniku", 50.32106693213589, 17.577615185103497))
        markers.add(
            SingleMarker(
                "PSSE w Strzelcach Opolskich",
                50.51358073642496,
                18.304150540926113
            )
        )
        // PODKARPACKIE
        markers.add(SingleMarker("WSSE w Rzeszowie", 50.03402243684073, 22.014498998586635))
        markers.add(SingleMarker("GSSE w Przemyślu", 49.78419881575011, 22.790515527416837))
        markers.add(SingleMarker("PSSE w Brzozowie", 49.6922549026711, 22.008757727414384))
        markers.add(SingleMarker("PSSE w Dębicy", 50.04606033844545, 21.40302106975045))
        markers.add(SingleMarker("PSSE w Jarosławiu", 50.01651544939953, 22.680075998586272))
        markers.add(SingleMarker("PSSE w Jaśle", 49.74740597457794, 21.471594398579487))
        markers.add(SingleMarker("PSSE w Kolbuszowej", 50.24629352333674, 21.782448140919296))
        markers.add(SingleMarker("PSSE w Krośnie", 49.683682245913076, 21.755388027414185))
        markers.add(SingleMarker("PSSE w Leżajsku", 50.26309855510701, 22.417761998592606))
        markers.add(SingleMarker("PSSE w Lubaczowie", 50.16114510621911, 23.121415269753516))
        markers.add(SingleMarker("PSSE w Łańcucie", 50.06551630120608, 22.229257440914623))
        markers.add(SingleMarker("PSSE w Mielcu", 50.296092040855335, 21.443942827430014))
        markers.add(SingleMarker("PSSE w Nisku", 50.516670445400734, 22.157416169762705))
        markers.add(SingleMarker("PSSE w Przeworsku", 50.05677134407711, 22.494400569750734))
        markers.add(SingleMarker("PSSE w Przemyślu", 49.786955840659566, 22.75935554090731))
        markers.add(SingleMarker("PSSE w Ropczycach", 50.054863510381026, 21.62124049858724))
        markers.add(SingleMarker("PSSE w Rzeszowie", 50.023516444377606, 21.986476540913483))
        markers.add(SingleMarker("PSSE w Sanoku", 49.550474900629084, 22.200738727410716))
        markers.add(SingleMarker("PSSE w Stalowej Woli", 50.57076826265839, 22.048506998600445))
        markers.add(SingleMarker("PSSE w Strzyżowie", 49.868932809694726, 21.788568827418924))
        markers.add(SingleMarker("PSSE w Tarnobrzegu", 50.571782758032064, 21.666270898097512))
        markers.add(
            SingleMarker(
                "PSSE w Ustrzykach Dolnych",
                49.432892866222765,
                22.602757827407785
            )
        )
        // PODLASKIE
        markers.add(SingleMarker("WSSE w Białymstoku", 53.13104876574724, 23.16034832750484))
        markers.add(SingleMarker("GSSE w Suwałkach", 54.102833014811026, 22.940006269858408))
        markers.add(SingleMarker("PSSE w Augustowie", 53.83623631112154, 22.983238012178173))
        markers.add(SingleMarker("PSSE w Białymstoku", 53.1312898026955, 23.174640598668333))
        markers.add(SingleMarker("PSSE w Bielsku Podlaskim", 52.761301549531126, 23.20030072749484))
        markers.add(SingleMarker("PSSE w Grajewie", 53.64733142048775, 22.454203398682356))
        markers.add(SingleMarker("PSSE w Hajnówce", 52.73564228361838, 23.59152579865764))
        markers.add(SingleMarker("PSSE w Kolnie", 53.40780037562052, 21.932916727512463))
        markers.add(SingleMarker("PSSE w Łomży", 53.16236414229284, 22.081315540996247))
        markers.add(SingleMarker("PSSE w Mońkach", 53.4062761675638, 22.80022259867589))
        markers.add(SingleMarker("PSSE w Sejnach", 54.115035202777946, 23.35328565655621))
        markers.add(SingleMarker("PSSE w Siemiatyczach", 52.42861122170135, 22.85720722748605))
        markers.add(SingleMarker("PSSE w Sokółce", 53.408444856045826, 23.503170428666508))
        markers.add(SingleMarker("PSSE w Suwałkach", 54.10277639880508, 22.94002772753137))
        markers.add(
            SingleMarker(
                "PSSE w Wysokiem Mazowieckiem",
                52.912225249786346,
                22.51111606982596
            )
        )
        markers.add(SingleMarker("PSSE w Zambrowie", 52.98082315883663, 22.236963298664296))
        // POMORSKIE
        markers.add(SingleMarker("WSSE w Gdańsku", 54.36519933260913, 18.627970798702144))
        markers.add(SingleMarker("GSSE w Gdyni", 54.54977874828239, 18.498377298707243))
        markers.add(SingleMarker("PSSE w Bytowie", 54.17194608016224, 17.490368841023827))
        markers.add(SingleMarker("PSSE w Chojnicach", 53.69110208005461, 17.570000727520068))
        markers.add(SingleMarker("PSSE w Człuchowie", 53.661943697332966, 17.35381325692613))
        markers.add(SingleMarker("PSSE w Gdańsku", 54.35873423198916, 18.65399881219244))
        markers.add(SingleMarker("PSSE w Gdyni", 54.52123311540257, 18.53365645637941))
        markers.add(SingleMarker("PSSE w Kartuzach", 54.341032234678664, 18.20086099870151))
        markers.add(SingleMarker("PSSE w Kościerzynie", 54.122515906230085, 17.980461556368425))
        markers.add(SingleMarker("PSSE w Kwidzynie", 53.731591267446, 18.932028627521156))
        markers.add(SingleMarker("PSSE w Lęborku", 54.5470544264346, 17.766310169870604))
        markers.add(SingleMarker("PSSE w Malborku", 54.0297367906217, 19.023200169856402))
        markers.add(
            SingleMarker(
                "PSSE w Nowym Dworze Gdańskim",
                54.2115686251352,
                19.11011972753438
            )
        )
        markers.add(
            SingleMarker(
                "PSSE w Pruszczu Gdańskim",
                54.261309579799565,
                18.636378441026295
            )
        )
        markers.add(SingleMarker("PSSE w Pucku", 54.71552216713849, 18.410868498711793))
        markers.add(SingleMarker("PSSE w Słupsku", 54.4649454514513, 17.013149698704844))
        markers.add(SingleMarker("PSSE w Sopocie", 54.44031931641012, 18.565690298704187))
        markers.add(
            SingleMarker(
                "PSSE w Starogardzie Gdańskim",
                53.968993912963626,
                18.53292509869119
            )
        )
        markers.add(SingleMarker("PSSE w Tczewie", 54.08950844357564, 18.795360356367503))
        markers.add(SingleMarker("PSSE w Wejherowie", 54.608300776506866, 18.2460144121994))
        // ŚLĄSKIE
        markers.add(SingleMarker("WSSE w Katowicach", 50.25470757945098, 19.001185369755827))
        markers.add(SingleMarker("PSSE w Bielsku-Białej", 49.81843159127317, 19.052550269744675))
        markers.add(SingleMarker("PSSE w Bytomiu", 50.34375411412182, 18.921870769758222))
        markers.add(SingleMarker("PSSE w Chorzowie", 50.29781910077033, 18.95050081208404))
        markers.add(SingleMarker("PSSE w Cieszynie", 49.75235977485457, 18.63149262741603))
        markers.add(SingleMarker("PSSE w Częstochowie", 50.815565394256105, 19.117420469770433))
        markers.add(
            SingleMarker(
                "PSSE w Dąbrowie Górniczej",
                50.32030148070674,
                19.176781127430516
            )
        )
        markers.add(SingleMarker("PSSE w Gliwicach", 50.29201369700627, 18.676475169756802))
        markers.add(SingleMarker("PSSE w Jawarznie", 50.201870746807415, 19.275896698590998))
        markers.add(SingleMarker("PSSE w Katowicach", 50.249865621280065, 19.007981312082865))
        markers.add(SingleMarker("PSSE w Kłobucku", 50.899267112591424, 18.935839298609075))
        markers.add(SingleMarker("PSSE w Lublińcu", 50.671691278135256, 18.69030824093027))
        markers.add(SingleMarker("PSSE w Myszkowie", 50.57017670796414, 19.31371776976405))
        markers.add(SingleMarker("PSSE w Raciborzu", 50.092668528617224, 18.223796998588185))
        markers.add(SingleMarker("PSSE w Rudzie Śląskiej", 50.27163389538232, 18.867091427429273))
        markers.add(SingleMarker("PSSE w Rybniku", 50.110551801407645, 18.54513386975218))
        markers.add(SingleMarker("PSSE w Sosnowcu", 50.27390502143498, 19.14374489859284))
        markers.add(SingleMarker("PSSE w Tychach", 50.12851895734515, 18.9698221985891))
        markers.add(
            SingleMarker(
                "PSSE w Wodzisławiu Śłąskim",
                49.999743072219296,
                18.4597717120764
            )
        )
        markers.add(SingleMarker("PSSE w Zawierciu", 50.49337225414756, 19.417278969762016))
        markers.add(SingleMarker("PSSE w Żywcu", 49.687510902638664, 19.205005227414308))
        // ŚWIĘTOKRZYSKIE
        markers.add(SingleMarker("WSSE w Kielcach", 50.87239476125777, 20.605221198608362))
        markers.add(SingleMarker("PSSE w Busku Zdroju", 50.46887316611061, 20.720417283251944))
        markers.add(SingleMarker("PSSE w Jędrzejowie", 50.641665791175164, 20.3000836832564))
        markers.add(SingleMarker("PSSE w Kielcach", 50.855987897972845, 20.554223740935043))
        markers.add(SingleMarker("PSSE w Końskich", 51.18913135253695, 20.421695940943764))
        markers.add(SingleMarker("PSSE w Opatowie", 50.8036397403507, 21.428855540933572))
        markers.add(
            SingleMarker(
                "PSSE w Ostrowcu Świętokrzyskim",
                50.93528004083698,
                21.383323856282974
            )
        )
        markers.add(SingleMarker("PSSE w Sandomierzu", 50.68995897330191, 21.732034627440136))
        markers.add(
            SingleMarker(
                "PSSE w Skarżysku Kamiennej",
                51.11785357957529,
                20.89218439861477
            )
        )
        markers.add(SingleMarker("PSSE w Starachowicach", 51.050614446624316, 21.084720627449467))
        markers.add(SingleMarker("PSSE w Staszowie", 50.559637974058944, 21.17102049860023))
        markers.add(SingleMarker("PSSE we Włoszczowie", 50.85320629918434, 19.958190727444368))
        // WARMIŃSKO-MAZURSKIE
        markers.add(SingleMarker("WSSE w Olsztynie", 53.77061332102355, 20.49037664101285))
        markers.add(SingleMarker("GSSE w Elblągu", 54.15978125433355, 19.41617862753297))
        markers.add(SingleMarker("PSSE w Bartoszycach", 54.24747771758566, 20.813957098698914))
        markers.add(SingleMarker("PSSE w Braniewie", 54.385590175605, 19.82994274102969))
        markers.add(SingleMarker("PSSE w Działdowie", 53.23289208943433, 20.17569845634418))
        markers.add(SingleMarker("PSSE w Elblągu", 54.17871101761123, 19.424657069860494))
        markers.add(SingleMarker("PSSE w Ełku", 53.828832144394354, 22.351672869850866))
        markers.add(SingleMarker("PSSE w Giżycku", 54.03680768419346, 21.78401336985656))
        markers.add(SingleMarker("PSSE w Gołdapi", 54.30488728007816, 22.301441727536925))
        markers.add(SingleMarker("PSSE w Iławie", 53.5993980803928, 19.551696541008194))
        markers.add(SingleMarker("PSSE w Kętrzynie", 54.078540157538136, 21.37171636985774))
        markers.add(
            SingleMarker(
                "PSSE w Lidzbarku Warmińskim",
                54.12510741658237,
                20.586076269858978
            )
        )
        markers.add(SingleMarker("PSSE w Mrągowie", 53.876071905230916, 21.305137541015707))
        markers.add(SingleMarker("PSSE w Nidzicy", 53.35790850814476, 20.428286341001492))
        markers.add(
            SingleMarker(
                "PSSE w Nowym Mieście Lubawskim",
                53.42761855059054,
                19.58806181216701
            )
        )
        markers.add(SingleMarker("PSSE w Olecku", 54.03566458182797, 22.49632126985662))
        markers.add(SingleMarker("PSSE w Olsztynie", 53.77063234387203, 20.490398098685812))
        markers.add(SingleMarker("PSSE w Ostródzie", 53.69691263629472, 19.96287392752029))
        markers.add(SingleMarker("PSSE w Piszu", 53.625910742828985, 21.812440527518365))
        markers.add(SingleMarker("PSSE w Szczytnie", 53.55812706194466, 20.987450792359432))
        markers.add(SingleMarker("PSSE w Węgorzowie", 54.20751125494496, 21.737947998697752))
        // WIELKOPOLSKIE
        markers.add(SingleMarker("WSSE w Poznaniu", 52.41347675639496, 16.916864869812553))
        markers.add(SingleMarker("PSSE w Chodzieży", 52.9915153540426, 16.91097326982816))
        markers.add(SingleMarker("PSSE w Czarnkowie", 52.905127992756114, 16.56114805633527))
        markers.add(SingleMarker("PSSE w Gnieźnie", 52.53092925993986, 17.594578669815736))
        markers.add(SingleMarker("PSSE w Gostyniu", 51.883293337491885, 17.00625099863492))
        markers.add(
            SingleMarker(
                "PSSE w Grodzisku Wielkopolskim",
                52.215945500023125,
                16.363030612134338
            )
        )
        markers.add(SingleMarker("PSSE w Jarocinie", 51.97162319875281, 17.501974085146745))
        markers.add(SingleMarker("PSSE w Kaliszu", 51.759838942528916, 18.083871040958737))
        markers.add(SingleMarker("PSSE w Kępnie", 51.27980482391514, 17.983286456292028))
        markers.add(SingleMarker("PSSE w Kole", 52.20261323054443, 18.629403269806982))
        markers.add(SingleMarker("PSSE w Koninie", 52.20965037459967, 18.250861798643676))
        markers.add(SingleMarker("PSSE w Kościanie", 52.08861004098872, 16.642224540967444))
        markers.add(SingleMarker("PSSE w Krotoszynie", 51.69745027943527, 17.434757812120587))
        markers.add(SingleMarker("PSSE w Lesznie", 51.845712379694284, 16.58839654096102))
        markers.add(SingleMarker("PSSE w Międzychodzie", 52.595926430959985, 15.896072812144535))
        markers.add(SingleMarker("PSSE w Nowym Tomyślu", 52.317267213444694, 16.129193898646474))
        markers.add(SingleMarker("PSSE w Obornikach", 52.65290120553646, 16.81934949865553))
        markers.add(
            SingleMarker(
                "PSSE w Ostrowie Wielkopolskim",
                51.64888905071227,
                17.81912452746525
            )
        )
        markers.add(SingleMarker("PSSE w Ostrzeszowie", 51.41906681462491, 17.93085286978624))
        markers.add(SingleMarker("PSSE w Pile", 53.15212584794647, 16.717028369832498))
        markers.add(SingleMarker("PSSE w Pleszewie", 51.89686118241088, 17.782248969798815))
        markers.add(SingleMarker("PSSE w Poznaniu", 52.43009898821628, 16.93453589864952))
        markers.add(SingleMarker("PSSE w Rawiczu", 51.61151347965456, 16.854144640954786))
        markers.add(SingleMarker("PSSE w Słupcy", 52.28797423080007, 17.874164812136303))
        markers.add(SingleMarker("PSSE w Szamotułach", 52.59950497983151, 16.588487269817584))
        markers.add(SingleMarker("PSSE w Śremie", 52.08017916672415, 17.029784540967196))
        markers.add(
            SingleMarker(
                "PSSE w Środzie Wielkopolskiej",
                52.22569429569645,
                17.28435114097109
            )
        )
        markers.add(SingleMarker("PSSE w Turku", 52.01433137972375, 18.504504669801985))
        markers.add(SingleMarker("PSSE w Wągrowcu", 52.799066806304346, 17.214342869823))
        markers.add(SingleMarker("PSSE w Wolsztynie", 52.12311456689271, 16.122779727477774))
        markers.add(SingleMarker("PSSE we Wrześni", 52.318288654572605, 17.557904627482987))
        markers.add(SingleMarker("PSSE w Złotowie", 53.36897858144752, 17.025106412165364))
        // ZACHODNIOPOMORSKIE
        markers.add(SingleMarker("WSSE w Szczecinie", 53.41503917453382, 14.555380027512609))
        markers.add(SingleMarker("GSSE w Szczecinie", 53.447736217741934, 14.518614627513436))
        markers.add(SingleMarker("GSSE w Świnoujściu", 53.89188214796075, 14.215797856362071))
        markers.add(SingleMarker("PSSE w Białogardzie", 54.00852628508535, 15.989029541019349))
        markers.add(SingleMarker("PSSE w Choszcznie", 53.163724744472454, 15.423356269832807))
        markers.add(SingleMarker("PSSE w Drawsku Pomorskim", 53.52536949177328, 15.815847998679102))
        markers.add(SingleMarker("PSSE w Goleniowie", 53.56353276879024, 14.833021269843691))
        markers.add(SingleMarker("PSSE w Gryficach", 53.92007193517079, 15.196765727526389))
        markers.add(SingleMarker("PSSE w Gryfinie", 53.26009665121651, 14.489799269835432))
        markers.add(SingleMarker("PSSE w Kamieniu Pomorskim", 53.96244885176472, 14.77511145636401))
        markers.add(SingleMarker("PSSE w Kolobrzegu", 54.18015065375589, 15.572249541024021))
        markers.add(SingleMarker("PSSE w Koszalinie", 54.19025775756137, 16.1960072275338))
        markers.add(SingleMarker("PSSE w Łobezie", 53.63331678841053, 15.616305998682087))
        markers.add(SingleMarker("PSSE w Myśliborzu", 52.928164447408534, 14.870858456335936))
        markers.add(SingleMarker("PSSE w Policach", 53.54491210500855, 14.543992827516112))
        markers.add(SingleMarker("PSSE w Pyrzycach", 53.12975477993628, 14.886832740995487))
        markers.add(SingleMarker("PSSE w Sławnie", 54.36782673141016, 16.682620727538723))
        markers.add(SingleMarker("PSSE w Stargardzie", 53.33740419859865, 15.039072312164608))
        markers.add(SingleMarker("PSSE w Szczecinie", 53.45087275830196, 14.514721269840594))
        markers.add(SingleMarker("PSSE w Szczecinku", 53.71039768014672, 16.6833401698477))
        markers.add(SingleMarker("PSSE w Świdwinie", 53.76833838655641, 15.772740398685789))
        markers.add(SingleMarker("PSSE w Świnoujściu", 53.91026613807321, 14.246245669853149))
        markers.add(SingleMarker("PSSE w Wałczu", 53.267015996738074, 16.461158256345))
    }
}