import SwiftUI
import shared

class ContentViewProxy : ObservableObject {
    
    @Published
    var listItems : [ListEntry] = []
    
    let repository = DefaultListItemRepository()
    
    func load() {
        listItems = repository.listItems()
    }
    
}
struct ContentView: View {
    
    @ObservedObject
    var proxy = ContentViewProxy()
    
    var body: some View {
        List(proxy.listItems, id: \.title) { listItem in
            ListViewItem(title: listItem.title, subtitle: listItem.subtitle, imageUrl: "SampleImage")
        }.onAppear(perform: {
            proxy.load()
        })
    }
}

struct ContentView_Previews: PreviewProvider {
    static var previews: some View {
        ContentView()
    }
}
