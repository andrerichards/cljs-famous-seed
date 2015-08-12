(ns ^:figwheel-always seed.core
    (:require-macros [cljs.core.async.macros :refer [go]])
    (:require [com.kaicode.infamous :as infamous :refer [famous]]
              [datascript :as d]
              [cljs.core.async :refer [alts!]]))

(enable-console-print!)

(defonce FamousEngine (.. famous -core -FamousEngine))
(defonce Size (.. famous -components -Size))
(defonce ABSOLUTE (.. Size -ABSOLUTE))

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
                                                     {:onUpdate (fn [time]
                                                                  (let [logo (:node/famous-node (infamous/get-node-by-id "logo"))
                                                                        c (-> (d/q '[:find (pull ?c [*]) :where [?node :node/components ?c]] @infamous/conn ) second first)]
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
                                                                    (.. FamousEngine (requestUpdate (clj->js c) ))))}]}
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

(let [logo (:node/famous-node (infamous/get-node-by-id "logo"))
      c (-> (d/q '[:find (pull ?c [*]) :where [?node :node/components ?c]] @infamous/conn) second first)]
  (.. FamousEngine (requestUpdate (clj->js c) )))




