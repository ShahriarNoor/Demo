import groovy.transform.Field

@Field def products=[
        ['ProductID' : 'ARK-0001',
         'Label' : 'PlasticChair',
         'UOM': 'PCE',
         'Industry': 'Chemicals',
         'ProductGroup' : 'Homeware',
         'ProductType' : 'Furniture',
         'PackagingType' : 'Bulk',
         'Color' : 'Blue'
        ],
        ['ProductID' : 'ARK-0002',
         'Label' : 'Desk',
         'UOM': 'PCE',
         'Industry': 'Chemicals',
         'ProductGroup' : 'Office Essentials',
         'ProductType' : 'Furniture',
         'PackagingType' : 'Bulk',
         'Color' : 'Black'
        ],
        ['ProductID' : 'ARK-0003',
         'Label' : 'Couch',
         'UOM': 'PCE',
         'Industry': 'Chemicals',
         'ProductGroup' : 'Homeware',
         'ProductType' : 'Furniture',
         'PackagingType' : 'Bulk',
         'Color' : 'White'
        ],
        ['ProductID' : 'ARK-0004',
         'Label' : 'Cabinet',
         'UOM': 'PCE',
         'Industry': 'Chemicals',
         'ProductGroup' : 'Homeware',
         'ProductType' : 'Furniture',
         'PackagingType' : 'Bulk',
         'Color' : 'Blue'
        ]

]


@Field def customers =[
        ['CustomerID' : 'CS-0001',
         'Name' : 'Jononi Furniture',
         'Country': 'Bangladesh',
         'Address': 'Jhautola, Cumilla',
         'Classification': 'A',
         'Type' : 'Direct'],
        ['CustomerID' : 'CS-0002',
         'Name' : 'AB Furniture',
         'Country': 'Bangladesh',
         'Address': 'Kandirpar, Cumilla',
         'Classification': 'A',
         'Type' : 'Direct'],
        ['CustomerID' : 'CS-0003',
         'Name' : 'CD Furniture',
         'Country': 'Bangladesh',
         'Address': 'Kandirar, Cumilla',
         'Classification': 'B',
         'Type' : 'Direct'],
        ['CustomerID' : 'CS-0004',
         'Name' : 'EF Furniture',
         'Country': 'Bangladesh',
         'Address': 'Jhautola, Cumilla',
         'Classification': 'B',
         'Type' : 'Direct']

]

@Field def product_Cost=[
        ['ProductID': 'ARK-0001',
         'Cost' :45
        ],
        ['ProductID': 'ARK-0002',
         'Cost' :50],
        ['ProductID': 'ARK-0003',
         'Cost' :75],
        ['ProductID': 'ARK-0004',
         'Cost' :100]
]

@Field def cost_Plus_Price =[
        ['ProductGroup':'Homeware',
         'Adjustment':300
        ],

        ['ProductGroup':'Office Essentials',
         'Adjustment':200
        ]
]




@Field def price_Discount= [
        ['ProductID' : 'ARK-0001',
         'CustomerID' : 'CS-0001',
         'Discounts' : '2%'],
        ['ProductID' : 'ARK-0002',
         'CustomerID' : 'CS-0002',
         'Discounts' : '1.5%'],
        ['ProductID' : 'ARK-0003',
         'CustomerID' : 'CS-0003',
         'Discounts' : '2%'],
        ['ProductID' : 'ARK-0004',
         'CustomerID' : 'CS-0004',
         'Discounts' : '1%']
]

@Field  def packaging_Adjustment=[
        ['ProductGroup':'Homeware',
         'PackagingAdjustment':'2.5%'
        ],
        ['ProductGroup':'Office Essentials',
         'PackagingAdjustment':'2%'
        ]


]

@Field def packaging_Cost=[
        ['ProductGroup':'Homeware',
         'PackagingCost':'2.1%'
        ],
        ['ProductGroup':'Office Essentials',
         'PackagingCost':'2%'
        ]
]
@Field def warehouse_Adjustment=[
        ['ProductGroup':'Homeware',
         'WarehouseAdjustment':'2.5%'
        ],
        ['ProductGroup':'Office Essentials',
         'WarehouseAdjustment':'2%'
        ]


]

@Field def warehouse_Cost=[
        ['ProductGroup':'Homeware',
         'WarehouseCost':'2.1%'
        ],
        ['ProductGroup':'Office Essentials',
         'WarehouseCost':'2%'
        ]
]

@Field def promotion_Discount=[
        ['ProductID' : 'ARK-0001',
         'CustomerID' : 'CS-0001',
         'PromotionName':'Volume Discount',
         'PromotionType':'Percent',
         'PromotionAmount':'2%',
         'ValidFrom':'2022-01-01',
         'ValidTo':'2022-12-31'
        ],
        ['ProductID' : 'ARK-0002',
         'CustomerID' : 'CS-0002',
         'PromotionName':'Sales Channel Discount',
         'PromotionType':'Absolute',
         'PromotionAmount':23,
         'ValidFrom':'2022-01-01',
         'ValidTo':'2022-12-31'
        ],
        ['ProductID' : 'ARK-0003',
         'CustomerID' : 'CS-0003',
         'PromotionName':'Volume Discount',
         'PromotionType':'Percent',
         'PromotionAmount':'2.5%',
         'ValidFrom':'2022-01-01',
         'ValidTo':'2022-12-31'
        ],
        ['ProductID' : 'ARK-0004',
         'CustomerID' : 'CS-0004',
         'PromotionName':'Sales Channel Discount',
         'PromotionType':'Absolute',
         'PromotionAmount':30,
         'ValidFrom':'2022-01-01',
         'ValidTo':'2022-12-31'
        ]
]




@Field def rebate_Agreement=[
        ['ProductID' : 'ARK-0001',
         'CustomerID' : 'CS-0001',
         'AgreementName':'Yearly Agreement',
         'AgreementID':'RBA-0001',
         'ValidFrom':'2022-01-01',
         'ValidTo':'2022-12-31'
        ],
        ['ProductID' : 'ARK-0002',
         'CustomerID' : 'CS-0002',
         'AgreementName':'Monthly Agreement',
         'AgreementID':'RBA-0002',
         'ValidFrom':'2022-02-01',
         'ValidTo':'2022-11-31'
        ],
        ['ProductID' : 'ARK-0003',
         'CustomerID' : 'CS-0003',
         'AgreementName':'Monthly Agreement',
         'AgreementID':'RBA-0003',
         'ValidFrom':'2022-03-01',
         'ValidTo':'2022-10-31'
        ]
]
@Field def rebate_Record=[
        ['RecordID':'RR-0001',
         'AgreementID':'RBA-0001',
         'Rebate':32,
         'ValidFrom':'2022-01-01',
         'ValidTo':'2022-12-31'
        ],
        ['RecordID':'RR-0002',
         'AgreementID':'RBA-0002',
         'Rebate':20,
         'ValidFrom':'2022-02-01',
         'ValidTo':'2022-11-31'
        ],
        ['RecordID':'RR-0003',
         'AgreementID':'RBA-0003',
         'Rebate':10,
         'ValidFrom':'2022-03-01',
         'ValidTo':'2022-10-31'
        ]

]




def getInvoicePrice(def productID){
            def costMap=product_Cost.find{it.ProductID == productID}
            def cost=costMap.getAt('Cost')
            def productsMap=products.find{it.ProductID == productID}
            def productGroup=productsMap.getAt("ProductGroup")
            def adjustmentMap = cost_Plus_Price.find{it.ProductGroup == productGroup}
            def adjustment=adjustmentMap.getAt("Adjustment")
            def basePrice=cost+adjustment
            def discountPriceMap=price_Discount.find{it.ProductID == productID}
            def discount=discountPriceMap.getAt("Discounts")
            discount=discount.substring(0,discount.length()-1) as float

            def packgingAdjustMap=packaging_Adjustment.find{it.ProductGroup == productGroup}
            packgingAdjustment=packgingAdjustMap.getAt("PackagingAdjustment")
            packgingAdjustment=packgingAdjustment.substring(0,packgingAdjustment.length()-1) as float

            def warehouseAdjustMap=warehouse_Adjustment.find{it.ProductGroup == productGroup}
            warehouseAdjustment=warehouseAdjustMap.getAt("WarehouseAdjustment")
            warehouseAdjustment=warehouseAdjustment.substring(0,warehouseAdjustment.length()-1) as float
            def invoicePrice=basePrice-(discount*basePrice/100)+((packgingAdjustment*basePrice)/100)+((warehouseAdjustment*basePrice)/100)

            def packgingCostMap=packaging_Cost.find{it.ProductGroup == productGroup}
            packgingCost=packgingCostMap.getAt("PackagingCost")
            packgingCost=packgingCost.substring(0,packgingCost.length()-1) as float
            def warehouseCostMap=warehouse_Cost.find{it.ProductGroup == productGroup}
            wareHousecost=warehouseCostMap.getAt("WarehouseCost")
            wareHousecost=wareHousecost.substring(0,wareHousecost.length()-1) as float

            def promotionDiscountMap=promotion_Discount.find{it.ProductID == productID}
            def promotionType=promotionDiscountMap.getAt("PromotionType")
            if(promotionType=="Absolute"){
                    def promotionDiscount=promotionDiscountMap.getAt("PromotionAmount")
                    def netPrice=(invoicePrice-((packgingCost*basePrice)/100)-((wareHousecost*basePrice)/100)-promotionDiscount)
            }
            else{
                    def promotionDiscount=promotionDiscountMap.getAt("PromotionAmount")
                    promotionDiscount=promotionDiscount.substring(0,promotionDiscount.length()-1) as float
                    def netPrice=(invoicePrice-((packgingCost*basePrice)/100)-((wareHousecost*basePrice)/100)-((promotionDiscount*basePrice)/100))
            }


    }
            println(getInvoicePrice('ARK-0004'))






