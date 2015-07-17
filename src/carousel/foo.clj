(ns carousel.foo)

[:node {:id "root"}
 [:node {:id "back",
         :size-mode [1 1],
         :absolute-size [40 40],
         :align [0 0.5 0],
         :position [40 0 0],
         :mount-point [0 0.5 0],
         :components [[:DOMElement {:color "white", :fontSize "40px", :lineHeight "40px", :cursor "pointer", :textHighlight "none", :zIndex "2", :content "<"}]]}]
 
 [:node {:id "next",
         :size-mode [1 1],
         :absolute-size [40 40],
         :align [1 0.5 0],
         :position [-40 0 0],
         :mount-point [1 0.5 0],
         :components [[:DOMElement {:color "white", :fontSize "40px", :lineHeight "40px", :cursor "pointer", :textHighlight "none", :zIndex "2", :content ">"}]]}]
 [[:node {:size-mode [1 1 1],
          :absolute-size [500 500 0],
          :align [0.5 0.5],
          :mount-point [0.5 0.5],
          :origin [0.5 0.5],
          :components [[:DOMElement {:backgroundImage "url('http://demo.famo.us.s3.amazonaws.com/hub/apps/carousel/Museo_del_Prado_-_Goya_-_Caprichos_-_No._01_-_Autorretrato._Francisco_Goya_y_Lucientes2C_pintor_thumb.jpg')", :background-repeat "no-repeat", :background-size "cover"}]]}]

  [:node {:size-mode [1 1 1],
          :absolute-size [500 500 0],
          :align [0.5 0.5],
          :mount-point [0.5 0.5],
          :origin [0.5 0.5],
          :components [[:DOMElement {:backgroundImage "url('http://demo.famo.us.s3.amazonaws.com/hub/apps/carousel/Museo_del_Prado_-_Goya_-_Caprichos_-_No._02_-_El_si_pronuncian_y_la_mano_alargan_al_primero_que_llega_thumb.jpg')", :background-repeat "no-repeat", :background-size "cover"}]]}]]
 [:node {:id "dots",
         :size-mode [1 1], :absolute-size [20 20],
         :position [0 -50 0],
         :align [0.5 1 0],
         :mount-point [0.5 1 0]}
  [[:node {:size-mode [1 1],
           :absolute-size [5 5],
           :components [[:DOMElement {:borderRadius "5px", :border "2px solid white", :boxSizing "border-box"}]]}]
   [:node {:size-mode [1 1],
           :absolute-size [5 5],
           :components [[:DOMElement {:borderRadius "5px", :border "2px solid white", :boxSizing "border-box"}]]}]
   [:node {:size-mode [1 1],
           :absolute-size [5 5],
           :components [[:DOMElement {:borderRadius "5px", :border "2px solid white", :boxSizing "border-box"}]]}]
   [:node {:size-mode [1 1],
           :absolute-size [5 5],
           :components [[:DOMElement {:borderRadius "5px", :border "2px solid white", :boxSizing "border-box"}]]}]
   [:node {:size-mode [1 1], :absolute-size [5 5], :components [[:DOMElement {:borderRadius "5px", :border "2px solid white", :boxSizing "border-box"}]]}]]]]

(def s (initialize scene-graph) )


(nil nil ([[:node {:size-mode [1 1 1], :absolute-size [500 500 0], :align [0.5 0.5], :mount-point [0.5 0.5], :origin [0.5 0.5], :components [[:DOMElement {:backgroundImage "url('http://demo.famo.us.s3.amazonaws.com/hub/apps/carousel/Museo_del_Prado_-_Goya_-_Caprichos_-_No._01_-_Autorretrato._Francisco_Goya_y_Lucientes2C_pintor_thumb.jpg')", :background-repeat "no-repeat", :background-size "cover"}]], :physics {:box #<[object Object]>, :anchor #<[object Object]>, :spring #<[object Object]>, :quaternion #<[object Object]>, :rotational-spring #<[object Object]>}}]] [[:node {:size-mode [1 1 1], :absolute-size [500 500 0], :align [0.5 0.5], :mount-point [0.5 0.5], :origin [0.5 0.5], :components [[:DOMElement {:backgroundImage "url('http://demo.famo.us.s3.amazonaws.com/hub/apps/carousel/Museo_del_Prado_-_Goya_-_Caprichos_-_No._02_-_El_si_pronuncian_y_la_mano_alargan_al_primero_que_llega_thumb.jpg')", :background-repeat "no-repeat", :background-size "cover"}]], :physics {:box #<[object Object]>, :anchor #<[object Object]>, :spring #<[object Object]>, :quaternion #<[object Object]>, :rotational-spring #<[object Object]>}}]] [[:node {:size-mode [1 1 1], :absolute-size [500 500 0], :align [0.5 0.5], :mount-point [0.5 0.5], :origin [0.5 0.5], :components [[:DOMElement {:backgroundImage "url('http://demo.famo.us.s3.amazonaws.com/hub/apps/carousel/Museo_del_Prado_-_Goya_-_Caprichos_-_No._03_-_Que_viene_el_Coco_thumb.jpg')", :background-repeat "no-repeat", :background-size "cover"}]], :physics {:box #<[object Object]>, :anchor #<[object Object]>, :spring #<[object Object]>, :quaternion #<[object Object]>, :rotational-spring #<[object Object]>}}]] [[:node {:size-mode [1 1 1], :absolute-size [500 500 0], :align [0.5 0.5], :mount-point [0.5 0.5], :origin [0.5 0.5], :components [[:DOMElement {:backgroundImage "url('http://demo.famo.us.s3.amazonaws.com/hub/apps/carousel/Museo_del_Prado_-_Goya_-_Caprichos_-_No._04_-_El_de_la_rollona_thumb.jpg')", :background-repeat "no-repeat", :background-size "cover"}]], :physics {:box #<[object Object]>, :anchor #<[object Object]>, :spring #<[object Object]>, :quaternion #<[object Object]>, :rotational-spring #<[object Object]>}}]] [[:node {:size-mode [1 1 1], :absolute-size [500 500 0], :align [0.5 0.5], :mount-point [0.5 0.5], :origin [0.5 0.5], :components [[:DOMElement {:backgroundImage "url('http://demo.famo.us.s3.amazonaws.com/hub/apps/carousel/Museo_del_Prado_-_Goya_-_Caprichos_-_No._05_-_Tal_para_qual_thumb.jpg')", :background-repeat "no-repeat", :background-size "cover"}]], :physics {:box #<[object Object]>, :anchor #<[object Object]>, :spring #<[object Object]>, :quaternion #<[object Object]>, :rotational-spring #<[object Object]>}}]] [[:node {:size-mode [1 1 1], :absolute-size [500 500 0], :align [0.5 0.5], :mount-point [0.5 0.5], :origin [0.5 0.5], :components [[:DOMElement {:backgroundImage "url('http://demo.famo.us.s3.amazonaws.com/hub/apps/carousel/Museo_del_Prado_-_Goya_-_Caprichos_-_No._06_-_Nadie_se_conoce_thumb.jpg')", :background-repeat "no-repeat", :background-size "cover"}]], :physics {:box #<[object Object]>, :anchor #<[object Object]>, :spring #<[object Object]>, :quaternion #<[object Object]>, :rotational-spring #<[object Object]>}}]] [[:node {:size-mode [1 1 1], :absolute-size [500 500 0], :align [0.5 0.5], :mount-point [0.5 0.5], :origin [0.5 0.5], :components [[:DOMElement {:backgroundImage "url('http://demo.famo.us.s3.amazonaws.com/hub/apps/carousel/Museo_del_Prado_-_Goya_-_Caprichos_-_No._07_-_Ni_asi_la_distingue_thumb.jpg')", :background-repeat "no-repeat", :background-size "cover"}]], :physics {:box #<[object Object]>, :anchor #<[object Object]>, :spring #<[object Object]>, :quaternion #<[object Object]>, :rotational-spring #<[object Object]>}}]] [[:node {:size-mode [1 1 1], :absolute-size [500 500 0], :align [0.5 0.5], :mount-point [0.5 0.5], :origin [0.5 0.5], :components [[:DOMElement {:backgroundImage "url('http://demo.famo.us.s3.amazonaws.com/hub/apps/carousel/Museo_del_Prado_-_Goya_-_Caprichos_-_No._09_-_Tantalo_thumb.jpg')", :background-repeat "no-repeat", :background-size "cover"}]], :physics {:box #<[object Object]>, :anchor #<[object Object]>, :spring #<[object Object]>, :quaternion #<[object Object]>, :rotational-spring #<[object Object]>}}]] [[:node {:size-mode [1 1 1], :absolute-size [500 500 0], :align [0.5 0.5], :mount-point [0.5 0.5], :origin [0.5 0.5], :components [[:DOMElement {:backgroundImage "url('http://demo.famo.us.s3.amazonaws.com/hub/apps/carousel/Museo_del_Prado_-_Goya_-_Caprichos_-_No._10_-_El_amor_y_la_muerte_thumb.jpg')", :background-repeat "no-repeat", :background-size "cover"}]], :physics {:box #<[object Object]>, :anchor #<[object Object]>, :spring #<[object Object]>, :quaternion #<[object Object]>, :rotational-spring #<[object Object]>}}]] [[:node {:size-mode [1 1 1], :absolute-size [500 500 0], :align [0.5 0.5], :mount-point [0.5 0.5], :origin [0.5 0.5], :components [[:DOMElement {:backgroundImage "url('http://demo.famo.us.s3.amazonaws.com/hub/apps/carousel/Museo_del_Prado_-_Goya_-_Caprichos_-_No._11_-_Muchachos_al_avC3ADo_thumb.jpg')", :background-repeat "no-repeat", :background-size "cover"}]], :physics {:box #<[object Object]>, :anchor #<[object Object]>, :spring #<[object Object]>, :quaternion #<[object Object]>, :rotational-spring #<[object Object]>}}]] [[:node {:size-mode [1 1 1], :absolute-size [500 500 0], :align [0.5 0.5], :mount-point [0.5 0.5], :origin [0.5 0.5], :components [[:DOMElement {:backgroundImage "url('http://demo.famo.us.s3.amazonaws.com/hub/apps/carousel/Museo_del_Prado_-_Goya_-_Caprichos_-_No._12_-_A_caza_de_dientes_thumb.jpg')", :background-repeat "no-repeat", :background-size "cover"}]], :physics {:box #<[object Object]>, :anchor #<[object Object]>, :spring #<[object Object]>, :quaternion #<[object Object]>, :rotational-spring #<[object Object]>}}]] [[:node {:size-mode [1 1 1], :absolute-size [500 500 0], :align [0.5 0.5], :mount-point [0.5 0.5], :origin [0.5 0.5], :components [[:DOMElement {:backgroundImage "url('http://demo.famo.us.s3.amazonaws.com/hub/apps/carousel/Museo_del_Prado_-_Goya_-_Caprichos_-_No._13_-_Estan_calientes_thumb.jpg')", :background-repeat "no-repeat", :background-size "cover"}]], :physics {:box #<[object Object]>, :anchor #<[object Object]>, :spring #<[object Object]>, :quaternion #<[object Object]>, :rotational-spring #<[object Object]>}}]]) (nil nil nil nil nil nil nil nil nil nil nil nil))


[:node {:id "root"}
 [ [:node {:id "pager"} [ [:n1 {:components [:c1]}]
                          [:n2 {:components [:c1]}]]]]]

[[:node {:id "back", :size-mode [1 1], :absolute-size [40 40], :position [40 0 0], :align [0 0.5 0], :mount-point [0 0.5 0], :components [[:DOMElement {:color "white", :fontSize "40px", :lineHeight "40px", :cursor "pointer", :textHighlight "none", :zIndex "2", :content "<"}]]}]
 [:node {:id "next", :size-mode [1 1], :absolute-size [40 40], :position [-40 0 0], :align [1 0.5 0], :mount-point [1 0.5 0], :components [[:DOMElement {:color "white", :fontSize "40px", :lineHeight "40px", :cursor "pointer", :textHighlight "none", :zIndex "2", :content ">"}]]}]]
