(ns ^:figwheel-always seed.core
    (:require [com.kaicode.infamous :as infamous :refer [famous]]
              [datascript :as d]))

(enable-console-print!)

(defonce FamousEngine (.. famous -core -FamousEngine))
(defonce Size (.. famous -components -Size))
(defonce ABSOLUTE (.. Size -ABSOLUTE))

(defn find-animation-component []
  "the scene-graph is stored in data-script. query for component with :component/id equal to animation"
  (let [component (-> (d/q '[:find (pull ?c [*]) :where [?c :component/id "animation"]] @infamous/conn) ffirst)]
    (clj->js component) ;convert a component (plain old clojure map) into a javascript map (ie javascript object)
    ))

(def scene-graph {:node/id         "root"
                  :node/children [{:node/id "logo"
                                   :node/size-mode [ABSOLUTE ABSOLUTE ABSOLUTE]
                                   :node/absolute-size [250 250]
                                   :node/align [0.5 0.5]
                                   :node/mount-point [0.5 0.5]
                                   :node/origin [0.5 0.5]
                                   :node/components [{:component/type :DOMElement
                                                      :tag-name "img"
                                                      :src "http://verse.aasemoon.com/images/5/51/Clojure-Logo.png"}
                                                     {:component/id "animation"
                                                      :onUpdate (fn [time]
                                                                  (let [logo (:node/famous-node (infamous/get-node-by-id "logo"))
                                                                        animation (find-animation-component)]
                                                                    (.. logo (setRotation  0 0 (/ time 1000)))
                                                                    (.. logo (setPosition (+ 50 (* 500 (.sin js/Math (/ time 1000))))
                                                                                          50
                                                                                          (+ 50 (* 500 (.cos js/Math (/ time 1000) )))))
                                                                    (.. logo (setAbsoluteSize (* 250
                                                                                                 (+ (.cos js/Math
                                                                                                          (/ time 1000)) 1.5 ))
                                                                                              (* 250
                                                                                                 (+ (.cos js/Math
                                                                                                          (/ time 1000)) 1.5 ))))
                                                                    (.. FamousEngine (requestUpdate animation))))}]}
                                  {:node/id "bigben"
                                   :node/size-mode [ABSOLUTE ABSOLUTE ABSOLUTE]
                                   :node/absolute-size [(/ 1728 3) (/ 2304 3)]
                                   :node/align [0.5 0.5]
                                   :node/mount-point [0.5 0.5]
                                   :node/origin [0.5 0.5]
                                   :node/components [{:component/type :DOMElement
                                                     :tag-name "img"
                                                     :src "https://upload.wikimedia.org/wikipedia/commons/e/eb/Big_ben_closeup.jpg"}]}]})

(infamous/render-scene-graph scene-graph "body")

;;code below will be encapsulated somehow in future releases
(let [logo (:node/famous-node (infamous/get-node-by-id "logo"))
      animation (find-animation-component)]
  (.. FamousEngine (requestUpdate animation)))
