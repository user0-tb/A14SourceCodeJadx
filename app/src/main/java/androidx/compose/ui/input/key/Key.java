package androidx.compose.ui.input.key;

/* compiled from: go/retraceme 56a29ddcb1e7781e96a7f0eae9764fd95150a8d849b28fe37c764d7d19c0db72 */
/* loaded from: classes.dex */
public abstract class Key {
    public static final /* synthetic */ int $r8$clinit = 0;
    private static final long Back;
    private static final long DirectionCenter;
    private static final long DirectionDown;
    private static final long DirectionLeft;
    private static final long DirectionRight;
    private static final long DirectionUp;
    private static final long Enter;
    private static final long Escape;
    private static final long NumPadEnter;
    private static final long Tab;

    static {
        Key_androidKt.Key(0);
        Key_androidKt.Key(1);
        Key_androidKt.Key(2);
        Key_androidKt.Key(3);
        Back = Key_androidKt.Key(4);
        Key_androidKt.Key(259);
        Key_androidKt.Key(260);
        Key_androidKt.Key(261);
        Key_androidKt.Key(262);
        Key_androidKt.Key(263);
        Key_androidKt.Key(280);
        Key_androidKt.Key(281);
        Key_androidKt.Key(282);
        Key_androidKt.Key(283);
        Key_androidKt.Key(5);
        Key_androidKt.Key(6);
        DirectionUp = Key_androidKt.Key(19);
        DirectionDown = Key_androidKt.Key(20);
        DirectionLeft = Key_androidKt.Key(21);
        DirectionRight = Key_androidKt.Key(22);
        DirectionCenter = Key_androidKt.Key(23);
        Key_androidKt.Key(268);
        Key_androidKt.Key(269);
        Key_androidKt.Key(270);
        Key_androidKt.Key(271);
        Key_androidKt.Key(24);
        Key_androidKt.Key(25);
        Key_androidKt.Key(26);
        Key_androidKt.Key(27);
        Key_androidKt.Key(28);
        Key_androidKt.Key(7);
        Key_androidKt.Key(8);
        Key_androidKt.Key(9);
        Key_androidKt.Key(10);
        Key_androidKt.Key(11);
        Key_androidKt.Key(12);
        Key_androidKt.Key(13);
        Key_androidKt.Key(14);
        Key_androidKt.Key(15);
        Key_androidKt.Key(16);
        Key_androidKt.Key(81);
        Key_androidKt.Key(69);
        Key_androidKt.Key(17);
        Key_androidKt.Key(70);
        Key_androidKt.Key(18);
        Key_androidKt.Key(29);
        Key_androidKt.Key(30);
        Key_androidKt.Key(31);
        Key_androidKt.Key(32);
        Key_androidKt.Key(33);
        Key_androidKt.Key(34);
        Key_androidKt.Key(35);
        Key_androidKt.Key(36);
        Key_androidKt.Key(37);
        Key_androidKt.Key(38);
        Key_androidKt.Key(39);
        Key_androidKt.Key(40);
        Key_androidKt.Key(41);
        Key_androidKt.Key(42);
        Key_androidKt.Key(43);
        Key_androidKt.Key(44);
        Key_androidKt.Key(45);
        Key_androidKt.Key(46);
        Key_androidKt.Key(47);
        Key_androidKt.Key(48);
        Key_androidKt.Key(49);
        Key_androidKt.Key(50);
        Key_androidKt.Key(51);
        Key_androidKt.Key(52);
        Key_androidKt.Key(53);
        Key_androidKt.Key(54);
        Key_androidKt.Key(55);
        Key_androidKt.Key(56);
        Key_androidKt.Key(57);
        Key_androidKt.Key(58);
        Key_androidKt.Key(59);
        Key_androidKt.Key(60);
        Tab = Key_androidKt.Key(61);
        Key_androidKt.Key(62);
        Key_androidKt.Key(63);
        Key_androidKt.Key(64);
        Key_androidKt.Key(65);
        Enter = Key_androidKt.Key(66);
        Key_androidKt.Key(67);
        Key_androidKt.Key(112);
        Escape = Key_androidKt.Key(111);
        Key_androidKt.Key(113);
        Key_androidKt.Key(114);
        Key_androidKt.Key(115);
        Key_androidKt.Key(116);
        Key_androidKt.Key(117);
        Key_androidKt.Key(118);
        Key_androidKt.Key(119);
        Key_androidKt.Key(120);
        Key_androidKt.Key(121);
        Key_androidKt.Key(122);
        Key_androidKt.Key(123);
        Key_androidKt.Key(124);
        Key_androidKt.Key(277);
        Key_androidKt.Key(278);
        Key_androidKt.Key(279);
        Key_androidKt.Key(68);
        Key_androidKt.Key(71);
        Key_androidKt.Key(72);
        Key_androidKt.Key(76);
        Key_androidKt.Key(73);
        Key_androidKt.Key(74);
        Key_androidKt.Key(75);
        Key_androidKt.Key(77);
        Key_androidKt.Key(78);
        Key_androidKt.Key(79);
        Key_androidKt.Key(80);
        Key_androidKt.Key(82);
        Key_androidKt.Key(83);
        Key_androidKt.Key(84);
        Key_androidKt.Key(92);
        Key_androidKt.Key(93);
        Key_androidKt.Key(94);
        Key_androidKt.Key(95);
        Key_androidKt.Key(96);
        Key_androidKt.Key(97);
        Key_androidKt.Key(98);
        Key_androidKt.Key(99);
        Key_androidKt.Key(100);
        Key_androidKt.Key(101);
        Key_androidKt.Key(102);
        Key_androidKt.Key(103);
        Key_androidKt.Key(104);
        Key_androidKt.Key(105);
        Key_androidKt.Key(106);
        Key_androidKt.Key(107);
        Key_androidKt.Key(108);
        Key_androidKt.Key(109);
        Key_androidKt.Key(110);
        Key_androidKt.Key(188);
        Key_androidKt.Key(189);
        Key_androidKt.Key(190);
        Key_androidKt.Key(191);
        Key_androidKt.Key(192);
        Key_androidKt.Key(193);
        Key_androidKt.Key(194);
        Key_androidKt.Key(195);
        Key_androidKt.Key(196);
        Key_androidKt.Key(197);
        Key_androidKt.Key(198);
        Key_androidKt.Key(199);
        Key_androidKt.Key(200);
        Key_androidKt.Key(201);
        Key_androidKt.Key(202);
        Key_androidKt.Key(203);
        Key_androidKt.Key(125);
        Key_androidKt.Key(131);
        Key_androidKt.Key(132);
        Key_androidKt.Key(133);
        Key_androidKt.Key(134);
        Key_androidKt.Key(135);
        Key_androidKt.Key(136);
        Key_androidKt.Key(137);
        Key_androidKt.Key(138);
        Key_androidKt.Key(139);
        Key_androidKt.Key(140);
        Key_androidKt.Key(141);
        Key_androidKt.Key(142);
        Key_androidKt.Key(143);
        Key_androidKt.Key(144);
        Key_androidKt.Key(145);
        Key_androidKt.Key(146);
        Key_androidKt.Key(147);
        Key_androidKt.Key(148);
        Key_androidKt.Key(149);
        Key_androidKt.Key(150);
        Key_androidKt.Key(151);
        Key_androidKt.Key(152);
        Key_androidKt.Key(153);
        Key_androidKt.Key(154);
        Key_androidKt.Key(155);
        Key_androidKt.Key(156);
        Key_androidKt.Key(157);
        Key_androidKt.Key(158);
        Key_androidKt.Key(159);
        NumPadEnter = Key_androidKt.Key(160);
        Key_androidKt.Key(161);
        Key_androidKt.Key(162);
        Key_androidKt.Key(163);
        Key_androidKt.Key(126);
        Key_androidKt.Key(127);
        Key_androidKt.Key(85);
        Key_androidKt.Key(86);
        Key_androidKt.Key(130);
        Key_androidKt.Key(87);
        Key_androidKt.Key(88);
        Key_androidKt.Key(89);
        Key_androidKt.Key(90);
        Key_androidKt.Key(128);
        Key_androidKt.Key(222);
        Key_androidKt.Key(129);
        Key_androidKt.Key(226);
        Key_androidKt.Key(272);
        Key_androidKt.Key(273);
        Key_androidKt.Key(274);
        Key_androidKt.Key(275);
        Key_androidKt.Key(91);
        Key_androidKt.Key(164);
        Key_androidKt.Key(165);
        Key_androidKt.Key(166);
        Key_androidKt.Key(167);
        Key_androidKt.Key(168);
        Key_androidKt.Key(169);
        Key_androidKt.Key(170);
        Key_androidKt.Key(171);
        Key_androidKt.Key(172);
        Key_androidKt.Key(173);
        Key_androidKt.Key(174);
        Key_androidKt.Key(175);
        Key_androidKt.Key(176);
        Key_androidKt.Key(177);
        Key_androidKt.Key(178);
        Key_androidKt.Key(179);
        Key_androidKt.Key(180);
        Key_androidKt.Key(181);
        Key_androidKt.Key(182);
        Key_androidKt.Key(183);
        Key_androidKt.Key(184);
        Key_androidKt.Key(185);
        Key_androidKt.Key(186);
        Key_androidKt.Key(187);
        Key_androidKt.Key(204);
        Key_androidKt.Key(205);
        Key_androidKt.Key(206);
        Key_androidKt.Key(207);
        Key_androidKt.Key(208);
        Key_androidKt.Key(209);
        Key_androidKt.Key(210);
        Key_androidKt.Key(211);
        Key_androidKt.Key(212);
        Key_androidKt.Key(213);
        Key_androidKt.Key(214);
        Key_androidKt.Key(215);
        Key_androidKt.Key(216);
        Key_androidKt.Key(217);
        Key_androidKt.Key(218);
        Key_androidKt.Key(219);
        Key_androidKt.Key(220);
        Key_androidKt.Key(221);
        Key_androidKt.Key(223);
        Key_androidKt.Key(224);
        Key_androidKt.Key(276);
        Key_androidKt.Key(225);
        Key_androidKt.Key(229);
        Key_androidKt.Key(230);
        Key_androidKt.Key(231);
        Key_androidKt.Key(232);
        Key_androidKt.Key(233);
        Key_androidKt.Key(234);
        Key_androidKt.Key(235);
        Key_androidKt.Key(236);
        Key_androidKt.Key(237);
        Key_androidKt.Key(238);
        Key_androidKt.Key(239);
        Key_androidKt.Key(240);
        Key_androidKt.Key(241);
        Key_androidKt.Key(242);
        Key_androidKt.Key(243);
        Key_androidKt.Key(244);
        Key_androidKt.Key(245);
        Key_androidKt.Key(246);
        Key_androidKt.Key(247);
        Key_androidKt.Key(248);
        Key_androidKt.Key(249);
        Key_androidKt.Key(250);
        Key_androidKt.Key(251);
        Key_androidKt.Key(252);
        Key_androidKt.Key(253);
        Key_androidKt.Key(254);
        Key_androidKt.Key(255);
        Key_androidKt.Key(256);
        Key_androidKt.Key(257);
        Key_androidKt.Key(258);
        Key_androidKt.Key(264);
        Key_androidKt.Key(265);
        Key_androidKt.Key(266);
        Key_androidKt.Key(267);
        Key_androidKt.Key(284);
        Key_androidKt.Key(285);
        Key_androidKt.Key(286);
        Key_androidKt.Key(287);
        Key_androidKt.Key(288);
    }

    /* renamed from: equals-impl0  reason: not valid java name */
    public static final boolean m173equalsimpl0(long j, long j2) {
        if (j == j2) {
            return true;
        }
        return false;
    }
}